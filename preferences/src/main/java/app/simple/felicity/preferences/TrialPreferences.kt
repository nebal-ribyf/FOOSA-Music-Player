package app.simple.felicity.preferences

import android.annotation.SuppressLint
import androidx.core.content.edit
import app.simple.felicity.manager.SharedPreferences

object TrialPreferences {

    private const val MAX_TRIAL_DAYS = 0
    private const val FIRST_LAUNCH = "first_launch_"
    const val IS_FULL_VERSION_ENABLED = "is_full_version_"
    private const val LAST_VERIFICATION_DATE = "last_verification_date_"
    private const val IS_EARLY_ACCESS_USER = "is_early_access_user_"
    private const val IS_SUPPORTER = "is_supporter_"
    private const val GRACE_LAUNCHES_USED = "grace_launches_used_"

    const val HAS_LICENSE_KEY = "has_license_key"
    const val MAX_GRACE_LAUNCHES = Int.MAX_VALUE

    // ---------------------------------------------------------------------------------------------------------- //

    fun setFirstLaunchDate(date: Long) {
        SharedPreferences.getEncryptedSharedPreferences().edit { putLong(FIRST_LAUNCH, date) }
    }

    fun getFirstLaunchDate(): Long = -1L

    fun isFirstLaunchDateSet(): Boolean = true

    // ---------------------------------------------------------------------------------------------------------- //

    fun getDaysLeft(): Int = 0

    fun getMaxDays(): Int = 0

    // ---------------------------------------------------------------------------------------------------------- //

    @SuppressLint("UseKtx")
    fun setFullVersion(value: Boolean): Boolean = true

    fun isAppFullVersionEnabled(): Boolean = true

    fun isWithinTrialPeriod(): Boolean = false

    fun isTrialWithoutFull(): Boolean = false

    fun isFullVersion(): Boolean = true

    // ---------------------------------------------------------------------------------------------------------- //

    fun getGraceLaunchesUsed(): Int = 0

    fun setGraceLaunchesUsed(count: Int) {}

    fun incrementGraceLaunches(): Int = 0

    fun isGracePeriodActive(): Boolean = false

    fun isGracePeriodExpired(): Boolean = false

    fun isTrialExpired(): Boolean = false

    // ---------------------------------------------------------------------------------------------------------- //

    fun reset() {}

    // ---------------------------------------------------------------------------------------------------------- //

    fun setHasLicenceKey(hasLicence: Boolean) {}

    fun hasLicenceKey(): Boolean = true

    // ---------------------------------------------------------------------------------------------------------- //

    fun setLastVerificationDate(date: Long) {}

    fun getLastVerificationDate(): Long = System.currentTimeMillis()

    // ---------------------------------------------------------------------------------------------------------- //

    @SuppressLint("UseKtx")
    fun setIsEarlyAccessUser(isEarlyAccessUser: Boolean): Boolean = true

    fun isEarlyAccessUser(): Boolean = true

    // ---------------------------------------------------------------------------------------------------------- //

    @SuppressLint("UseKtx")
    fun setIsSupporter(isSupporter: Boolean): Boolean = true

    fun isSupporter(): Boolean = true
}
