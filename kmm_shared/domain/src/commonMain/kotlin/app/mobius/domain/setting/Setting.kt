package app.mobius.domain.setting

import app.mobius.domain.setting.security.Security
import com.benasher44.uuid.Uuid

data class Setting(
    val uuid: Uuid? = null,
    val account: Account,
    val security: Security,
    val theme: Theme = Theme.DEFAULT
) {
    constructor() : this(account = Account(), security = Security())
}

enum class Theme {
    LIGHT, DARK, DEFAULT
}