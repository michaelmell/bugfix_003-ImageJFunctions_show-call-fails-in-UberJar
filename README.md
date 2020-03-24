A minimal example of a failing call to ImageJFunctions.show() from a shaded UberJar.

To run do:
 
 ```
cd /PATH/TO/GIT_REPO
mvn clean
./deploy
java -jar target/ImageJFunctions_show__failure_minimal_example-1.0-SNAPSHOT.jar test_image.tif
```

It should fail with:

```
Uncaught error fetching image:
java.lang.IllegalStateException: zip file closed
        at java.util.zip.ZipFile.ensureOpen(ZipFile.java:686)
        at java.util.zip.ZipFile.getInputStream(ZipFile.java:366)
        at java.util.jar.JarFile.getInputStream(JarFile.java:452)
        at sun.net.www.protocol.jar.JarURLConnection.getInputStream(JarURLConnection.java:164)
        at sun.awt.image.URLImageSource.getDecoder(URLImageSource.java:127)
        at sun.awt.image.InputStreamImageSource.doFetch(InputStreamImageSource.java:263)
        at sun.awt.image.ImageFetcher.fetchloop(ImageFetcher.java:205)
        at sun.awt.image.ImageFetcher.run(ImageFetcher.java:169)

```

Running from IntelliJ should display the image correctly.