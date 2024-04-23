package net.firestaff.mcp.gymsharkhomework.ui.product


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ModalBottomSheetLayout
import androidx.compose.material.ModalBottomSheetValue
import androidx.compose.material.rememberModalBottomSheetState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch
import net.firestaff.mcp.gymsharkhomework.models.Product
import net.firestaff.mcp.gymsharkhomework.ui.utils.Spacer8

@OptIn(ExperimentalMaterialApi::class, ExperimentalMaterial3Api::class)
@Composable
fun ProductDetailContent(
    product: Product
) {
    val scrollState = rememberScrollState()
    val coroutineScope = rememberCoroutineScope()
    val modalBottomSheetState = rememberModalBottomSheetState(
        initialValue = ModalBottomSheetValue.Hidden
    )

    ModalBottomSheetLayout(
        sheetState = modalBottomSheetState,
        sheetShape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp),
                sheetContent = {
            SizePickerBottomSheet(product)
        }
    ) {
        Column(modifier = Modifier.verticalScroll(scrollState)) {
            ProductFeaturedImageColumn(product)

            Column(modifier = Modifier.padding(horizontal = 16.dp)) {
                Spacer8()
                ProductInfoColumn(product = product)
                Spacer8()
                SizeDropdown(
                    product.sizeInStock,
                    onClick = {
                        coroutineScope.launch { modalBottomSheetState.show() }
                    },
                )
            }

            if (product.description.isNotEmpty()) {
                HorizontalDivider(modifier = Modifier.padding(vertical = 8.dp), thickness = 1.dp)
                SimpleHtmlText(
                    product.description,
                    modifier = Modifier.padding(horizontal = 24.dp)
                )
                Spacer8()
            }

            Spacer8()
        }
    }
}
