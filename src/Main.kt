fun main() {
    // Kullanımı
    val mySettings = settings {
        // credentials bloğunu kullanarak ayarları tanımlıyoruz
        credentials {
            username = "example"
            password = "123456"
            rememberMe = true
        }
    }

    // Ayarları kullanma
    println("Username: ${mySettings.username}")
    println("Password: ${mySettings.password}")
    println("Remember Me: ${mySettings.rememberMe}")
}