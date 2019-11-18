# image-resize

A simple Clojure application that resizes an image to various dimensions needed for IOS deployment. Currently
only has dimensions set for app icons.

## Usage

First modify the src and output paths in the core file to point to where you want to pull the image from and save the
new sizes.

Then, boot up in your repl and move into the ````image-resize.core```` namespace and run ````(resize-image)```` this will take a few seconds and spit out all your images in the output path. You can easily add new sizes or change the names of the output images by modifying the map at the top of the file.

## License

Copyright © 2019

MIT
