# App Icon Image Resizer

A simple Clojure application that resizes an image to various dimensions needed for IOS deployment. Currently
only has dimensions set for app icons.

## Usage

First modify the src and output paths in the core file to point to where you want to pull the image from and save the
new sizes.

Then, boot up in your repl and move into the ````image-resize.core```` namespace and run ````(resize-image)```` this will take a few seconds and spit out all your images in the output path. You can easily add new sizes or change the names of the output images by modifying the map at the top of the file.

There's also extra maps, paths, and ````resize-splash```` to create splash images. This one is broken into 2 maps for portrait and landscape to help make it look a lot better overall.

## TODO
1. Android icons

## License

Copyright © 2019

MIT
