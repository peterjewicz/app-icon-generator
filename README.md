# App Icon Image Resizer

A simple Clojure application that resizes an image to various dimensions needed for IOS deployment. Currently
has icons and splash screens.

## Usage

First modify the src and output paths in the core file to point to where you want to pull the image from and save the new sizes.

Then, boot up in your repl and move into the ````image-resize.core```` namespace and run ````(resize-image)```` this will take a few seconds and spit out all your images in the output path. You can easily add new sizes or change the names of the output images by modifying the maps at the top of the file.

There's also extra maps, paths, and ````resize-splash```` to create splash images. This one is broken into 2 maps for portrait and landscape to help make it look a lot better overall. It forces a resize here, so it may scale it a bit wonky if the source image and end dimensions are way off. The project includes two images that produced decent results for each.

Credit to image-resize (https://github.com/josephwilk/image-resizer) For the core resize functionality used.

## TODO
1. Android icons
2. Android Splashcreen

## License

Copyright © 2019
