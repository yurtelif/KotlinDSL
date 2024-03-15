// Kullanıcı adı ve şifre gibi kimlik doğrulama ayarlarını içeren bir alt DSL
class CredentialsDSL {
    var username: String = ""
    var password: String = ""
    var rememberMe: Boolean = false
}

// DSL kullanımı için bir işlev
fun settings(block: SettingsDSL.() -> Unit): SettingsDSL {
    // SettingsDSL'yi oluşturuyoruz ve verilen bloğu çalıştırıyoruz
    val settings = SettingsDSL().apply(block)
    // SettingsDSL'yi döndürüyoruz
    return settings
}