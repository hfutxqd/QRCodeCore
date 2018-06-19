package xyz.imxqd.qrcode.demo;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;

import xyz.imxqd.qrcode.QRCode;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = findViewById(R.id.image);
        Bitmap bitmap = QRCode.from("Hello world").withSize(500, 500).bitmap();
        imageView.setImageBitmap(bitmap);
    }
}
