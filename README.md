# QRCode

latest version :  [ ![Download](https://api.bintray.com/packages/hfutxqd/maven/qrcode/images/download.svg) ](https://bintray.com/hfutxqd/maven/qrcode/_latestVersion)

QRCodeCore is a very lite library for encoding QRCode.
It only has a total size of about 60kb.

It is based on [QRGen](https://github.com/kenglxn/QRGen) and [ZXing](https://github.com/zxing/zxing) , simplifying a lot of code.

Step 1. Add the repository to your build file
Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://dl.bintray.com/hfutxqd/maven' }
		}
	}

Step 2. Add the dependency

	dependencies {
	    implementation 'xyz.imxqd:qrcode:1.0.1'
	}
 If you use ZXing , use below instead :

	dependencies {
	    implementation 'xyz.imxqd:qrcode:1.0.1@aar'
	}


#### Usage (Same with [QRGen](https://github.com/kenglxn/QRGen)):

```java
// get QR file from text using defaults
File file = QRCode.from("Hello World").file();

// get QR stream from text using defaults
ByteArrayOutputStream stream = QRCode.from("Hello World").stream();

// override the image type to be JPG
QRCode.from("Hello World").to(ImageType.JPG).file();
QRCode.from("Hello World").to(ImageType.JPG).stream();

// override image size to be 250x250
QRCode.from("Hello World").withSize(250, 250).file();
QRCode.from("Hello World").withSize(250, 250).stream();

// override size and image type
QRCode.from("Hello World").to(ImageType.GIF).withSize(250, 250).file();
QRCode.from("Hello World").to(ImageType.GIF).withSize(250, 250).stream();

// override default colors (black on white)
// notice that the color format is "0x(alpha: 1 byte)(RGB: 3 bytes)"
// so in the example below it's red for foreground and yellowish for background, both 100% alpha (FF).
QRCode.from("Hello World").withColor(0xFFFF0000, 0xFFFFFFAA).file();

// supply own outputstream
QRCode.from("Hello World").to(ImageType.PNG).writeTo(outputStream);

// supply own file name
QRCode.from("Hello World").file("QRCode");

// supply charset hint to ZXING
QRCode.from("Hello World").withCharset("UTF-8");

// supply error correction level hint to ZXING
QRCode.from("Hello World").withErrorCorrection(ErrorCorrectionLevel.L);

// supply any hint to ZXING
QRCode.from("Hello World").withHint(EncodeHintType.CHARACTER_SET, "UTF-8");

// get QR bitmap
Bitmap myBitmap = QRCode.from("www.example.org").bitmap();
ImageView myImage = (ImageView) findViewById(R.id.imageView);
myImage.setImageBitmap(myBitmap);
```
