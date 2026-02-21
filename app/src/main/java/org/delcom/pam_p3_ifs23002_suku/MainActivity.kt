package org.delcom.pam_p3_ifs23002_suku

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import org.delcom.pam_p3_ifs23002_suku.ui.UIApp
import org.delcom.pam_p3_ifs23002_suku.ui.theme.DelcomTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DelcomTheme {
                UIApp()
            }
        }
    }
}