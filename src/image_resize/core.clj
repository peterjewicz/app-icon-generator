(ns image-resize.core
  (:require [image-resizer.core :refer :all]
           [image-resizer.format :refer :all]))

; All images are squares so we only need to know 1 dimension
; More dimensions can be added here if needed!
(def image-map {
  :icon-20.png      20
  :icon-20-2x.png   40
  :icon-29.png      29
  :icon-29-2x.png   58
  :icon-29-3x.png   87
  :icon-40.png      40
  :icon-40-2x.png   80
  :icon-50.png      50
  :icon-50-2x.png   100
  :icon-57-2x.png   114
  :icon-57.png      57
  :icon-60-2x.png   60
  :icon-60-3x.png   180
  :icon-72-2x.png   144
  :icon-72.png      72
  :icon-76.png      76
  :icon-76-2x.png   152
  :icon-83.5-2x.png 167
})

(def portrait-splash-map {
  :Default-667h.png `(750 1334)
  :Default-736h.png `(1242 2208)
  :iosxportrait.png `(1125 2436)
  :screen-iphone-portrait-2x.png `(640 960)
  :screen-iphone-portrait-568h-2x.png `(640 1136)
  :screen-iphone-portrait.png `(320 480)
})

(def landscape-splash-map {
  :screen-ipad-landscape-2x.png `(2048 1536)
  :screen-ipad-landscape.png `(1024 768)
  :screen-ipad-portrait-2x.png `(1536 2048)
  :screen-ipad-portrait.png `(768 1024)
  :screen-iphone-landscape-2x.png `(960 640)
  :screen-iphone-landscape.png `(480 320)
})

; Change these to match your source and ouput
(def path-to-src "/Applications/server/image-resize/src/image_resize/icon.png")
(def path-to-output "/Applications/server/image-resize/src/image_resize/")

(def path-to-src-splash "/Applications/server/image-resize/src/image_resize/landscape-splash.png")
(def path-to-splash-output "/Applications/server/image-resize/src/image_resize/")

(defn resize-image []
  (for [image image-map]
    (let [size (second image)
          filename (name (first image))]
      (as-file
        (resize (clojure.java.io/file path-to-src) size size)
        (str path-to-output filename)
        :verbatim))))

; uses force resize so may be a bit wonky - always check after!
(defn resize-splash [images-to-map]
  (for [image images-to-map]
    (let [sizex (first (second image))
          sizey (second (second image))
          filename (name (first image))]
    (as-file
      (force-resize (clojure.java.io/file path-to-src-splash) sizex sizey)
      (str path-to-splash-output filename)
      :verbatim))))

