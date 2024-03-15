// DSL'yi tanımlamak için bir sınıf oluşturuyoruz
class SettingsDSL {
    var username: String = ""
    var password: String = ""
    var rememberMe: Boolean = false

    // DSL içindeki ayarları tanımlamak için bir işlev
    fun credentials(block: CredentialsDSL.() -> Unit) {
        // CredentialsDSL'yi oluşturuyoruz ve verilen bloğu çalıştırıyoruz
        val credentials = CredentialsDSL().apply(block)
        // CredentialsDSL içindeki ayarları burada kullanabiliriz
        username = credentials.username
        password = credentials.password
        rememberMe = credentials.rememberMe
    }
}