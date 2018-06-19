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

