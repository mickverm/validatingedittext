package be.mickverm.widget.textfield.validators

import androidx.annotation.StringRes

class RequiredInputValidator(
    @StringRes private val errorRes: Int
) : InputValidator {

    override fun validate(input: String?) = when {
        input.isNullOrEmpty() -> errorRes
        else -> null
    }
}