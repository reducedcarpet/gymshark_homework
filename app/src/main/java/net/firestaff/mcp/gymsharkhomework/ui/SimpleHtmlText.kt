package net.firestaff.mcp.gymsharkhomework.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.material3.Text
import androidx.core.text.HtmlCompat

@Composable
fun SimpleHtmlText(htmlString: String) {
    val annotatedString = buildAnnotatedString {
        append(HtmlCompat.fromHtml(htmlString, HtmlCompat.FROM_HTML_MODE_LEGACY))
    }

    Text(text = annotatedString)
}