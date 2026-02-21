package org.delcom.pam_p3_ifs23002_suku.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import org.delcom.pam_p3_ifs23002_suku.R
import org.delcom.pam_p3_ifs23002_suku.ui.components.BottomNavComponent
import org.delcom.pam_p3_ifs23002_suku.ui.components.TopAppBarComponent
import org.delcom.pam_p3_ifs23002_suku.ui.theme.DelcomTheme

@Composable
fun ProfileScreen(
    navController: NavHostController,
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.background)
    ) {
        // Top App Bar
        TopAppBarComponent(navController = navController, title = "Profile", false)
        // Content
        Box(
            modifier = Modifier
                .weight(1f)
        ) {
            ProfileUI()
        }
        // Bottom Nav
        BottomNavComponent(navController = navController)
    }
}

@Composable
fun ProfileUI(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {

        // Header Profile
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 32.dp, bottom = 16.dp),
            contentAlignment = Alignment.Center
        ) {

            Column(horizontalAlignment = Alignment.CenterHorizontally) {

                // Foto Profile
                Image(
                    painter = painterResource(id = R.drawable.profileee),
                    contentDescription = "Profile Photo",
                    modifier = Modifier
                        .size(110.dp)
                        .clip(CircleShape)
                        .border(3.dp, Color.White, CircleShape)
                )

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = "Lamgok Hando Siahaan",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = "ifs23002",
                    fontSize = 16.sp,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
        }

        // Bio Section
        Card(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            shape = RoundedCornerShape(16.dp),
            elevation = CardDefaults.cardElevation(4.dp),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(
                    "Tentang Saya",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    "\"Bagi saya, baris kode bukan sekadar instruksi untuk mesin, melainkan potongan puzzle untuk membangun solusi di dunia nyata. Perjalanan saya di dunia teknologi dimulai dari rasa penasaran tentang bagaimana sebuah ketukan di layar ponsel bisa memicu reaksi berantai di server yang jauhnya ribuan kilometer.\n" +
                            "\n" +
                            "Sebagai developer yang bergerak di persimpangan Mobile dan Backend, saya tidak hanya membangun tampilan yang estetis, tetapi juga memastikan 'jantung' di baliknya berdetak dengan efisien melalui API yang kokoh. Saya percaya bahwa aplikasi yang hebat adalah perpaduan antara desain yang intuitif dan arsitektur data yang cerdas.\n" +
                            "\n" +
                            "Di luar aktivitas coding, saya adalah seorang pembelajar abadi. Dunia teknologi bergerak secepat kilat, dan saya selalu siap dengan 'sepatu lari' saya—menjelajahi framework baru, membedah dokumentasi, atau sekadar bereksperimen dengan proyek sampingan yang menantang batas kemampuan saya. Misi saya sederhana: mengubah ide yang kompleks menjadi aplikasi yang berguna dan memberikan dampak nyata bagi penggunanya.",
                    fontSize = 15.sp
                )
            }
        }

        Spacer(modifier = Modifier.height(8.dp))
    }
}

@Preview(showBackground = true, name = "Light Mode")
@Composable
fun PreviewProfileUI(){
    DelcomTheme {
        ProfileUI()
    }
}