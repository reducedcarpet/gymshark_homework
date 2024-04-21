package net.firestaff.mcp.gymsharkhomework.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import net.firestaff.mcp.gymsharkhomework.R
import net.firestaff.mcp.gymsharkhomework.infrastructure.log.LogUtil.debug
import net.firestaff.mcp.gymsharkhomework.models.Size
import net.firestaff.mcp.gymsharkhomework.ui.theme.black
import net.firestaff.mcp.gymsharkhomework.ui.theme.grey
import net.firestaff.mcp.gymsharkhomework.ui.theme.white

@Composable
fun SizeDropdown(sizes: List<Size>) {
    var expanded by remember { mutableStateOf(false) }

    val items = sizes.map { it.name }.toList()

    Box(modifier = Modifier, contentAlignment = Alignment.TopStart) {
        Button(
            onClick = { expanded = true },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = white,
                contentColor = black,
            ),
            shape = RoundedCornerShape(4.dp),
            border = ButtonDefaults.outlinedButtonBorder.copy(
                width = 1.dp,
                brush = SolidColor(grey)
            )
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(
                    stringResource(id = R.string.select_size),
                    style = MaterialTheme.typography.bodySmall,
                )
                Icon(
                    imageVector = Icons.Rounded.ArrowDropDown,
                    contentDescription = "Dropdown Chevron",
                )
            }
        }

        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
        ) {
            items.forEach { label ->
                DropdownMenuItem(
                    text = { Text(label) },
                    onClick = {
                        expanded = false
                        debug("Dropdown menu item clicked: $label")
                    }
                )
            }
        }
    }
}