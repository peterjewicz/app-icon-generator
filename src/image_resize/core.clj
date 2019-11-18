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

; Change these to match your source and ouput
(def path-to-src "/Applications/server/image-resize/src/image_resize/icon.png")
(def path-to-output "/Applications/server/image-resize/src/image_resize/")

(defn resize-image []
  (for [image image-map]
    (let [size (second image)
          filename (name (first image))]
      (as-file
        (resize (clojure.java.io/file path-to-src) size size)
        (str path-to-output filename)
        :verbatim))))

