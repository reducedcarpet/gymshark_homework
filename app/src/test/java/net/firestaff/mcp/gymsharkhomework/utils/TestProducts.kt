package net.firestaff.mcp.gymsharkhomework.utils

import net.firestaff.mcp.gymsharkhomework.models.AvailableSize
import net.firestaff.mcp.gymsharkhomework.models.Media
import net.firestaff.mcp.gymsharkhomework.models.Product
import net.firestaff.mcp.gymsharkhomework.models.Size


val testProduct = Product(
    "6732609257571",
    "B3A3E",
    true,
    listOf(
        Size.XS,
        Size.S,
        Size.M,
    ),
    listOf(
        AvailableSize(
            "39814344835171",
            true,
            1,
            1000,
            Size.XS,
            "B3A3E-UBCY-XS"
        ),
        AvailableSize(
            "39814344867939",
            false,
            0,
            1000,
            Size.S,
            "B3A3E-UBCY-S"
        ),
        AvailableSize(
            "39814344900707",
            false,
            0,
            1000,
            Size.M,
            "B3A3E-UBCY-M"
        ),

        ),
    "Cora Border Terrier",
    "gymshark-speed-leggings-navy-ss22",

    "<meta charset=\"utf-8\"><p data-mce-fragment=\"1\"><strong data-mce-fragment=\"1\">WALK WITH IT</strong></p><p data-mce-fragment=\"1\"><br data-mce-fragment=\"1\">Your walk requires a companion with spirited energy and enthusiasm, so step out and hit the paths with your Border Terrier. Known for their agility and friendliness, Border Terriers keep pace with you eagerly, making every walk enjoyable and full of adventure.</p><p data-mce-fragment=\"1\"> <br data-mce-fragment=\"1\"></p><p data-mce-fragment=\"1\"><br data-mce-fragment=\"1\">- Small but sturdy and tough<br data-mce-fragment=\"1\">- Affectionate and good-natured<br data-mce-fragment=\"1\">- Highly intelligent and trainable<br data-mce-fragment=\"1\">- Requires regular exercise and loves outdoor activities<br data-mce-fragment=\"1\">- Features a wiry coat that sheds dirt and mud easily<br data-mce-fragment=\"1\">- Coat: Dense undercoat with a harsh wiry outercoat<br data-mce-fragment=\"1\">- Ideal for families and active individuals alike<br data-mce-fragment=\"1\">- Typically stands about 10-11 inches at the shoulder<br data-mce-fragment=\"1\">- SKU: BTWALK2023-PATH</p>",
    "Doggo",
    listOf("f"),
    "",
    listOf("wire-haired", "limited-edition"),
    "Tan",
    1000.toDouble(),
    null,
    null,
    Media
        (
        "gid://shopify/ProductImage/29035954831459",
        null,
        "2022-04-06T15:19:54+01:00",
        2018,
        "29035954831459",
        1,
        "6732609257571",
        "http://mcp.firestaff.net/doggo/PXL_20240331_103521180~2.jpg",
        "2022-04-06T15:19:54+01:00",
        listOf(),
        1692
    ),
    listOf(
        Media(
            "gid://shopify/ProductImage/29035954831459",
            null,
            "2022-04-06T15:19:54+01:00",
            2018,
            "29035954831459",
            1,
            "6732609257571",
            "http://mcp.firestaff.net/doggo/PXL_20240331_103521180~2.jpg",
            "2022-04-06T15:19:54+01:00",
            listOf(),
            1692
        ),
        Media(
            "gid://shopify/ProductImage/29035954569315",
            null,
            "2022-04-06T15:19:53+01:00",
            2017,
            "29035954569315",
            2,
            "6732609257571",
            "http://mcp.firestaff.net/doggo/PXL_20240311_163014379.MP.jpg",
            "2022-04-06T15:19:54+01:00",
            listOf(),
            1692
        ),
    ),
    "6732609257571"
)

//

val testJson = """{
    "id": 6732609257571,
      "sku": "B3A3E",
      "inStock": true,
      "sizeInStock": ["xs", "l", "xl", "xxl"],
      "availableSizes": [
        {
          "id": 39814344835171,
          "inStock": true,
          "inventoryQuantity": 1,
          "price": 1000,
          "size": "xs",
          "sku": "B3A3E-UBCY-XS"
        },
        {
          "id": 39814344867939,
          "inStock": false,
          "inventoryQuantity": 0,
          "price": 1000,
          "size": "s",
          "sku": "B3A3E-UBCY-S"
        },
        {
          "id": 39814344900707,
          "inStock": false,
          "inventoryQuantity": 0,
          "price": 1000,
          "size": "m",
          "sku": "B3A3E-UBCY-M"
        },
        {
          "id": 39814344933475,
          "inStock": true,
          "inventoryQuantity": 1,
          "price": 1000,
          "size": "l",
          "sku": "B3A3E-UBCY-L"
        },
        {
          "id": 39814344966243,
          "inStock": true,
          "inventoryQuantity": 1,
          "price": 1000,
          "size": "xl",
          "sku": "B3A3E-UBCYXL"
        },
        {
          "id": 39814344999011,
          "inStock": true,
          "inventoryQuantity": 1,
          "price": 1000,
          "size": "xxl",
          "sku": "B3A3E-UBCY-XXL"
        }
      ],
      "handle": "gymshark-speed-leggings-navy-ss22",
      "title": "Cora Border Terrier",
      "description": "<meta charset=\"utf-8\"><p data-mce-fragment=\"1\"><strong data-mce-fragment=\"1\">WALK WITH IT</strong></p><p data-mce-fragment=\"1\"><br data-mce-fragment=\"1\">Your walk requires a companion with spirited energy and enthusiasm, so step out and hit the paths with your Border Terrier. Known for their agility and friendliness, Border Terriers keep pace with you eagerly, making every walk enjoyable and full of adventure.</p><p data-mce-fragment=\"1\"> <br data-mce-fragment=\"1\"></p><p data-mce-fragment=\"1\"><br data-mce-fragment=\"1\">- Small but sturdy and tough<br data-mce-fragment=\"1\">- Affectionate and good-natured<br data-mce-fragment=\"1\">- Highly intelligent and trainable<br data-mce-fragment=\"1\">- Requires regular exercise and loves outdoor activities<br data-mce-fragment=\"1\">- Features a wiry coat that sheds dirt and mud easily<br data-mce-fragment=\"1\">- Coat: Dense undercoat with a harsh wiry outercoat<br data-mce-fragment=\"1\">- Ideal for families and active individuals alike<br data-mce-fragment=\"1\">- Typically stands about 10-11 inches at the shoulder<br data-mce-fragment=\"1\">- SKU: BTWALK2023-PATH</p>",
      "type": "Doggo",
      "gender": ["f"],
      "fit": null,
      "labels": ["wire-haired", "limited-edition"],
      "colour": "Tan",
      "price": 1000,
      "compareAtPrice": null,
      "discountPercentage": null,
      "featuredMedia": {
        "admin_graphql_api_id": "gid://shopify/ProductImage/29035954831459",
        "alt": null,
        "created_at": "2022-04-06T15:19:54+01:00",
        "height": 2018,
        "id": 29035954831459,
        "position": 1,
        "product_id": 6732609257571,
        "src": "http://mcp.firestaff.net/doggo/PXL_20240331_103521180~2.jpg",
        "updated_at": "2022-04-06T15:19:54+01:00",
        "variant_ids": [],
        "width": 1692
      },
      "media": [
        {
          "admin_graphql_api_id": "gid://shopify/ProductImage/29035954831459",
          "alt": null,
          "created_at": "2022-04-06T15:19:54+01:00",
          "height": 2018,
          "id": 29035954831459,
          "position": 1,
          "product_id": 6732609257571,
          "src": "http://mcp.firestaff.net/doggo/PXL_20240331_103521180~2.jpg",
          "updated_at": "2022-04-06T15:19:54+01:00",
          "variant_ids": [],
          "width": 1692
        },
        {
          "admin_graphql_api_id": "gid://shopify/ProductImage/29035954569315",
          "alt": null,
          "created_at": "2022-04-06T15:19:53+01:00",
          "height": 2017,
          "id": 29035954569315,
          "position": 2,
          "product_id": 6732609257571,
          "src": "http://mcp.firestaff.net/doggo/PXL_20240311_163014379.MP.jpg",
          "updated_at": "2022-04-06T15:19:54+01:00",
          "variant_ids": [],
          "width": 1692
        },
        {
          "admin_graphql_api_id": "gid://shopify/ProductImage/29035954700387",
          "alt": null,
          "created_at": "2022-04-06T15:19:54+01:00",
          "height": 2018,
          "id": 29035954700387,
          "position": 3,
          "product_id": 6732609257571,
          "src": "http://mcp.firestaff.net/doggo/PXL_20240315_160825608.jpg",
          "updated_at": "2022-04-06T15:19:54+01:00",
          "variant_ids": [],
          "width": 1692
        },
        {
          "admin_graphql_api_id": "gid://shopify/ProductImage/29035954208867",
          "alt": null,
          "created_at": "2022-04-06T15:19:53+01:00",
          "height": 2018,
          "id": 29035954208867,
          "position": 4,
          "product_id": 6732609257571,
          "src": "http://mcp.firestaff.net/doggo/PXL_20240324_130328513.jpg",
          "updated_at": "2022-04-06T15:19:54+01:00",
          "variant_ids": [],
          "width": 1692
        },
        {
          "admin_graphql_api_id": "gid://shopify/ProductImage/29035954438243",
          "alt": null,
          "created_at": "2022-04-06T15:19:53+01:00",
          "height": 2018,
          "id": 29035954438243,
          "position": 5,
          "product_id": 6732609257571,
          "src": "http://mcp.firestaff.net/doggo/PXL_20240308_201914986~2.jpg",
          "updated_at": "2022-04-06T15:19:54+01:00",
          "variant_ids": [],
          "width": 1692
        },
        {
          "admin_graphql_api_id": "gid://shopify/ProductImage/29035954339939",
          "alt": null,
          "created_at": "2022-04-06T15:19:53+01:00",
          "height": 2018,
          "id": 29035954339939,
          "position": 6,
          "product_id": 6732609257571,
          "src": "http://mcp.firestaff.net/doggo/PXL_20240401_161418922.jpg",
          "updated_at": "2022-04-06T15:19:54+01:00",
          "variant_ids": [],
          "width": 1692
        },
        {
          "admin_graphql_api_id": "gid://shopify/ProductImage/29035954339939",
          "alt": null,
          "created_at": "2022-04-06T15:19:53+01:00",
          "height": 2018,
          "id": 29035954339937,
          "position": 7,
          "product_id": 6732609257571,
          "src": "http://mcp.firestaff.net/doggo/PXL_20240401_164636721.jpg",
          "updated_at": "2022-04-06T15:19:54+01:00",
          "variant_ids": [],
          "width": 1692
        }
      ],
      "objectID": "6732609257571"
}"""

val listJson = """[
        {
      "id": 6732609257571,
      "sku": "B3A3E",
      "inStock": true,
      "sizeInStock": ["xs", "l", "xl", "xxl"],
      "availableSizes": [
        {
          "id": 39814344835171,
          "inStock": true,
          "inventoryQuantity": 1,
          "price": 1000,
          "size": "xs",
          "sku": "B3A3E-UBCY-XS"
        },
        {
          "id": 39814344867939,
          "inStock": false,
          "inventoryQuantity": 0,
          "price": 1000,
          "size": "s",
          "sku": "B3A3E-UBCY-S"
        },
        {
          "id": 39814344900707,
          "inStock": false,
          "inventoryQuantity": 0,
          "price": 1000,
          "size": "m",
          "sku": "B3A3E-UBCY-M"
        },
        {
          "id": 39814344933475,
          "inStock": true,
          "inventoryQuantity": 1,
          "price": 1000,
          "size": "l",
          "sku": "B3A3E-UBCY-L"
        },
        {
          "id": 39814344966243,
          "inStock": true,
          "inventoryQuantity": 1,
          "price": 1000,
          "size": "xl",
          "sku": "B3A3E-UBCYXL"
        },
        {
          "id": 39814344999011,
          "inStock": true,
          "inventoryQuantity": 1,
          "price": 1000,
          "size": "xxl",
          "sku": "B3A3E-UBCY-XXL"
        }
      ],
      "handle": "gymshark-speed-leggings-navy-ss22",
      "title": "Cora Border Terrier",
      "description": "<meta charset=\"utf-8\"><p data-mce-fragment=\"1\"><strong data-mce-fragment=\"1\">WALK WITH IT</strong></p><p data-mce-fragment=\"1\"><br data-mce-fragment=\"1\">Your walk requires a companion with spirited energy and enthusiasm, so step out and hit the paths with your Border Terrier. Known for their agility and friendliness, Border Terriers keep pace with you eagerly, making every walk enjoyable and full of adventure.</p><p data-mce-fragment=\"1\"> <br data-mce-fragment=\"1\"></p><p data-mce-fragment=\"1\"><br data-mce-fragment=\"1\">- Small but sturdy and tough<br data-mce-fragment=\"1\">- Affectionate and good-natured<br data-mce-fragment=\"1\">- Highly intelligent and trainable<br data-mce-fragment=\"1\">- Requires regular exercise and loves outdoor activities<br data-mce-fragment=\"1\">- Features a wiry coat that sheds dirt and mud easily<br data-mce-fragment=\"1\">- Coat: Dense undercoat with a harsh wiry outercoat<br data-mce-fragment=\"1\">- Ideal for families and active individuals alike<br data-mce-fragment=\"1\">- Typically stands about 10-11 inches at the shoulder<br data-mce-fragment=\"1\">- SKU: BTWALK2023-PATH</p>",
      "type": "Doggo",
      "gender": ["f"],
      "fit": null,
      "labels": ["wire-haired", "limited-edition"],
      "colour": "Tan",
      "price": 1000,
      "compareAtPrice": null,
      "discountPercentage": null,
      "featuredMedia": {
        "admin_graphql_api_id": "gid://shopify/ProductImage/29035954831459",
        "alt": null,
        "created_at": "2022-04-06T15:19:54+01:00",
        "height": 2018,
        "id": 29035954831459,
        "position": 1,
        "product_id": 6732609257571,
        "src": "http://mcp.firestaff.net/doggo/PXL_20240331_103521180~2.jpg",
        "updated_at": "2022-04-06T15:19:54+01:00",
        "variant_ids": [],
        "width": 1692
      },
      "media": [
        {
          "admin_graphql_api_id": "gid://shopify/ProductImage/29035954831459",
          "alt": null,
          "created_at": "2022-04-06T15:19:54+01:00",
          "height": 2018,
          "id": 29035954831459,
          "position": 1,
          "product_id": 6732609257571,
          "src": "http://mcp.firestaff.net/doggo/PXL_20240331_103521180~2.jpg",
          "updated_at": "2022-04-06T15:19:54+01:00",
          "variant_ids": [],
          "width": 1692
        },
        {
          "admin_graphql_api_id": "gid://shopify/ProductImage/29035954569315",
          "alt": null,
          "created_at": "2022-04-06T15:19:53+01:00",
          "height": 2017,
          "id": 29035954569315,
          "position": 2,
          "product_id": 6732609257571,
          "src": "http://mcp.firestaff.net/doggo/PXL_20240311_163014379.MP.jpg",
          "updated_at": "2022-04-06T15:19:54+01:00",
          "variant_ids": [],
          "width": 1692
        },
        {
          "admin_graphql_api_id": "gid://shopify/ProductImage/29035954700387",
          "alt": null,
          "created_at": "2022-04-06T15:19:54+01:00",
          "height": 2018,
          "id": 29035954700387,
          "position": 3,
          "product_id": 6732609257571,
          "src": "http://mcp.firestaff.net/doggo/PXL_20240315_160825608.jpg",
          "updated_at": "2022-04-06T15:19:54+01:00",
          "variant_ids": [],
          "width": 1692
        },
        {
          "admin_graphql_api_id": "gid://shopify/ProductImage/29035954208867",
          "alt": null,
          "created_at": "2022-04-06T15:19:53+01:00",
          "height": 2018,
          "id": 29035954208867,
          "position": 4,
          "product_id": 6732609257571,
          "src": "http://mcp.firestaff.net/doggo/PXL_20240324_130328513.jpg",
          "updated_at": "2022-04-06T15:19:54+01:00",
          "variant_ids": [],
          "width": 1692
        },
        {
          "admin_graphql_api_id": "gid://shopify/ProductImage/29035954438243",
          "alt": null,
          "created_at": "2022-04-06T15:19:53+01:00",
          "height": 2018,
          "id": 29035954438243,
          "position": 5,
          "product_id": 6732609257571,
          "src": "http://mcp.firestaff.net/doggo/PXL_20240308_201914986~2.jpg",
          "updated_at": "2022-04-06T15:19:54+01:00",
          "variant_ids": [],
          "width": 1692
        },
        {
          "admin_graphql_api_id": "gid://shopify/ProductImage/29035954339939",
          "alt": null,
          "created_at": "2022-04-06T15:19:53+01:00",
          "height": 2018,
          "id": 29035954339939,
          "position": 6,
          "product_id": 6732609257571,
          "src": "http://mcp.firestaff.net/doggo/PXL_20240401_161418922.jpg",
          "updated_at": "2022-04-06T15:19:54+01:00",
          "variant_ids": [],
          "width": 1692
        },
        {
          "admin_graphql_api_id": "gid://shopify/ProductImage/29035954339939",
          "alt": null,
          "created_at": "2022-04-06T15:19:53+01:00",
          "height": 2018,
          "id": 29035954339937,
          "position": 7,
          "product_id": 6732609257571,
          "src": "http://mcp.firestaff.net/doggo/PXL_20240401_164636721.jpg",
          "updated_at": "2022-04-06T15:19:54+01:00",
          "variant_ids": [],
          "width": 1692
        }
      ],
      "objectID": "6732609257571"
    },
    {
      "id": 6732607094883,
      "sku": "B3A3E",
      "inStock": true,
      "sizeInStock": ["xs", "m", "l", "xl", "xxl"],
      "availableSizes": [
        {
          "id": 39814339690595,
          "inStock": true,
          "inventoryQuantity": 1,
          "price": 1000,
          "size": "xs",
          "sku": "B3A3E-UBFC-XS"
        },
        {
          "id": 39814339723363,
          "inStock": false,
          "inventoryQuantity": 0,
          "price": 1000,
          "size": "s",
          "sku": "B3A3E-UBFC-S"
        },
        {
          "id": 39814339756131,
          "inStock": true,
          "inventoryQuantity": 1,
          "price": 1000,
          "size": "m",
          "sku": "B3A3E-UBFC-M"
        },
        {
          "id": 39814339788899,
          "inStock": true,
          "inventoryQuantity": 1,
          "price": 1000,
          "size": "l",
          "sku": "B3A3E-UBFC-L"
        },
        {
          "id": 39814339821667,
          "inStock": true,
          "inventoryQuantity": 1,
          "price": 1000,
          "size": "xl",
          "sku": "B3A3E-UBFC-XL"
        },
        {
          "id": 39814339854435,
          "inStock": true,
          "inventoryQuantity": 1,
          "price": 1000,
          "size": "xxl",
          "sku": "B3A3E-UBFC-XXL"
        }
      ],
      "handle": "gymshark-speed-leggings-moonstone-blue-ss22",
      "title": "Bodi German Shepard",
      "description": "<meta charset=\"utf-8\"><p data-mce-fragment=\"1\"><strong data-mce-fragment=\"1\">RUN WITH IT</strong></p><p data-mce-fragment=\"1\"><br data-mce-fragment=\"1\">Your run requires a companion with enduring stamina and support, so step out and hit the trails with your German Shepherd. Known for their incredible endurance and versatility, German Shepherds move with you effortlessly, ensuring you can trust in your partner, no matter how far you go.</p><p data-mce-fragment=\"1\"> <br data-mce-fragment=\"1\"></p><p data-mce-fragment=\"1\"><br data-mce-fragment=\"1\">- Intelligent and highly trainable<br data-mce-fragment=\"1\">- Loyal and protective<br data-mce-fragment=\"1\">- Strong and agile<br data-mce-fragment=\"1\">- Requires regular mental and physical exercise<br data-mce-fragment=\"1\">- Features a dense double coat for weather resistance<br data-mce-fragment=\"1\">- Reflective coat markings can be seen in low light<br data-mce-fragment=\"1\">- Coat: 85% Dense undercoat, 15% Coarse outer coat<br data-mce-fragment=\"1\">- Known for their use in various service roles, from police work to search and rescue<br data-mce-fragment=\"1\">- Typically stands 24-26 inches at the shoulder for males, and 22-24 inches for females<br data-mce-fragment=\"1\">- SKU: GSD2023-TRAIL</p>",
      "type" : "Doggo",
      "gender": ["m"],
      "fit": null,
      "labels": null,
      "colour": "Tan and Black",
      "price": 1000,
      "compareAtPrice": null,
      "discountPercentage": null,
      "featuredMedia": {
        "admin_graphql_api_id": "gid://shopify/ProductImage/29031260979299",
        "alt": null,
        "created_at": "2022-04-05T09:55:32+01:00",
        "height": 2018,
        "id": 29031260979299,
        "position": 1,
        "product_id": 6732607094883,
        "src": "http://mcp.firestaff.net/doggo/PXL_20240305_092956400.jpg",
        "updated_at": "2022-04-05T09:55:49+01:00",
        "variant_ids": [],
        "width": 1692
      },
      "media": [
        {
          "admin_graphql_api_id": "gid://shopify/ProductImage/29031260979299",
          "alt": null,
          "created_at": "2022-04-05T09:55:32+01:00",
          "height": 2018,
          "id": 29031260979299,
          "position": 1,
          "product_id": 6732607094883,
          "src": "http://mcp.firestaff.net/doggo/PXL_20240305_092956400.jpg",
          "updated_at": "2022-04-05T09:55:49+01:00",
          "variant_ids": [],
          "width": 1692
        },
        {
          "admin_graphql_api_id": "gid://shopify/ProductImage/29031260815459",
          "alt": null,
          "created_at": "2022-04-05T09:55:30+01:00",
          "height": 2018,
          "id": 29031260815459,
          "position": 2,
          "product_id": 6732607094883,
          "src": "http://mcp.firestaff.net/doggo/PXL_20240320_171028451.jpg",
          "updated_at": "2022-04-05T09:55:49+01:00",
          "variant_ids": [],
          "width": 1692
        },
        {
          "admin_graphql_api_id": "gid://shopify/ProductImage/29031260848227",
          "alt": null,
          "created_at": "2022-04-05T09:55:30+01:00",
          "height": 2018,
          "id": 29031260848227,
          "position": 3,
          "product_id": 6732607094883,
          "src": "http://mcp.firestaff.net/doggo/PXL_20240321_154550997.MP~2.jpg",
          "updated_at": "2022-04-05T09:55:49+01:00",
          "variant_ids": [],
          "width": 1692
        },
        {
          "admin_graphql_api_id": "gid://shopify/ProductImage/29031260880995",
          "alt": null,
          "created_at": "2022-04-05T09:55:31+01:00",
          "height": 2018,
          "id": 29031260880995,
          "position": 4,
          "product_id": 6732607094883,
          "src": "http://mcp.firestaff.net/doggo/PXL_20240411_213810789~2.jpg",
          "updated_at": "2022-04-05T09:55:32+01:00",
          "variant_ids": [],
          "width": 1692
        },
        {
          "admin_graphql_api_id": "gid://shopify/ProductImage/29031260913763",
          "alt": null,
          "created_at": "2022-04-05T09:55:31+01:00",
          "height": 2018,
          "id": 29031260913763,
          "position": 5,
          "product_id": 6732607094883,
          "src": "http://mcp.firestaff.net/doggo/PXL_20240413_202731506.MP.jpg",
          "updated_at": "2022-04-05T09:55:32+01:00",
          "variant_ids": [],
          "width": 1692
        }
      ],
      "objectID": "6732607094883"
    },
    {
      "id": 6732607094884,
      "sku": "B3A3D",
      "inStock": true,
      "sizeInStock": ["m", "l", "xl", "xxl"],
      "availableSizes": [
        {
          "id": 39814339690595,
          "inStock": true,
          "inventoryQuantity": 1,
          "price": 1000,
          "size": "xs",
          "sku": "B3A3E-UBFC-XS"
        },
        {
          "id": 39814339723363,
          "inStock": false,
          "inventoryQuantity": 0,
          "price": 1000,
          "size": "s",
          "sku": "B3A3E-UBFC-S"
        },
        {
          "id": 39814339756131,
          "inStock": true,
          "inventoryQuantity": 1,
          "price": 1000,
          "size": "m",
          "sku": "B3A3E-UBFC-M"
        },
        {
          "id": 39814339788899,
          "inStock": true,
          "inventoryQuantity": 1,
          "price": 1000,
          "size": "l",
          "sku": "B3A3E-UBFC-L"
        },
        {
          "id": 39814339821667,
          "inStock": true,
          "inventoryQuantity": 1,
          "price": 1000,
          "size": "xl",
          "sku": "B3A3E-UBFC-XL"
        },
        {
          "id": 39814339854435,
          "inStock": true,
          "inventoryQuantity": 1,
          "price": 1000,
          "size": "xxl",
          "sku": "B3A3E-UBFC-XXL"
        }
      ],
      "handle": "gymshark-speed-leggings-moonstone-blue-ss23",
      "title": "Mud Goblin",
      "description": "<meta charset=\"utf-8\"><p data-mce-fragment=\"1\"><strong data-mce-fragment=\"1\">RUN WITH IT</strong></p><p data-mce-fragment=\"1\"><br data-mce-fragment=\"1\">Your run requires a companion with enduring stamina and support, so step out and hit the trails with your German Shepherd. Known for their incredible endurance and versatility, German Shepherds move with you effortlessly, ensuring you can trust in your partner, no matter how far you go.</p><p data-mce-fragment=\"1\"> <br data-mce-fragment=\"1\"></p><p data-mce-fragment=\"1\"><br data-mce-fragment=\"1\">- Intelligent and highly trainable<br data-mce-fragment=\"1\">- Loyal and protective<br data-mce-fragment=\"1\">- Strong and agile<br data-mce-fragment=\"1\">- Requires regular mental and physical exercise<br data-mce-fragment=\"1\">- Features a dense double coat for weather resistance<br data-mce-fragment=\"1\">- Reflective coat markings can be seen in low light<br data-mce-fragment=\"1\">- Coat: 85% Dense undercoat, 15% Coarse outer coat<br data-mce-fragment=\"1\">- Known for their use in various service roles, from police work to search and rescue<br data-mce-fragment=\"1\">- Typically stands 24-26 inches at the shoulder for males, and 22-24 inches for females<br data-mce-fragment=\"1\">- SKU: GSD2023-TRAIL</p>",
      "type" : "Doggo",
      "gender": ["m"],
      "fit": null,
      "labels": null,
      "colour": "Tan and Black",
      "price": 1000,
      "compareAtPrice": null,
      "discountPercentage": null,
      "featuredMedia": {
        "admin_graphql_api_id": "gid://shopify/ProductImage/29031260979299",
        "alt": null,
        "created_at": "2022-04-05T09:55:32+01:00",
        "height": 2018,
        "id": 29031260979299,
        "position": 2,
        "product_id": 6732607094883,
        "src": "http://mcp.firestaff.net/doggo/PXL_20240320_171028451.jpg",
        "updated_at": "2022-04-05T09:55:49+01:00",
        "variant_ids": [],
        "width": 1692
      },
      "media": [
        {
          "admin_graphql_api_id": "gid://shopify/ProductImage/29031260979299",
          "alt": null,
          "created_at": "2022-04-05T09:55:32+01:00",
          "height": 2018,
          "id": 29031260979299,
          "position": 1,
          "product_id": 6732607094883,
          "src": "http://mcp.firestaff.net/doggo/PXL_20240305_092956400.jpg",
          "updated_at": "2022-04-05T09:55:49+01:00",
          "variant_ids": [],
          "width": 1692
        },
        {
          "admin_graphql_api_id": "gid://shopify/ProductImage/29031260815459",
          "alt": null,
          "created_at": "2022-04-05T09:55:30+01:00",
          "height": 2018,
          "id": 29031260815459,
          "position": 2,
          "product_id": 6732607094883,
          "src": "http://mcp.firestaff.net/doggo/PXL_20240320_171028451.jpg",
          "updated_at": "2022-04-05T09:55:49+01:00",
          "variant_ids": [],
          "width": 1692
        },
        {
          "admin_graphql_api_id": "gid://shopify/ProductImage/29031260848227",
          "alt": null,
          "created_at": "2022-04-05T09:55:30+01:00",
          "height": 2018,
          "id": 29031260848227,
          "position": 3,
          "product_id": 6732607094883,
          "src": "http://mcp.firestaff.net/doggo/PXL_20240321_154550997.MP~2.jpg",
          "updated_at": "2022-04-05T09:55:49+01:00",
          "variant_ids": [],
          "width": 1692
        },
        {
          "admin_graphql_api_id": "gid://shopify/ProductImage/29031260880995",
          "alt": null,
          "created_at": "2022-04-05T09:55:31+01:00",
          "height": 2018,
          "id": 29031260880995,
          "position": 4,
          "product_id": 6732607094883,
          "src": "http://mcp.firestaff.net/doggo/PXL_20240411_213810789~2.jpg",
          "updated_at": "2022-04-05T09:55:32+01:00",
          "variant_ids": [],
          "width": 1692
        },
        {
          "admin_graphql_api_id": "gid://shopify/ProductImage/29031260913763",
          "alt": null,
          "created_at": "2022-04-05T09:55:31+01:00",
          "height": 2018,
          "id": 29031260913763,
          "position": 5,
          "product_id": 6732607094883,
          "src": "http://mcp.firestaff.net/doggo/PXL_20240413_202731506.MP.jpg",
          "updated_at": "2022-04-05T09:55:32+01:00",
          "variant_ids": [],
          "width": 1692
        }
      ],
      "objectID": "6732607094884"
    },
    {
      "id": 6732609257572,
      "sku": "B3A3C",
      "inStock": true,
      "sizeInStock": ["xs", "m", "xl", "xxl"],
      "availableSizes": [
        {
          "id": 39814344835171,
          "inStock": true,
          "inventoryQuantity": 1,
          "price": 1000,
          "size": "xs",
          "sku": "B3A3E-UBCY-XS"
        },
        {
          "id": 39814344867939,
          "inStock": false,
          "inventoryQuantity": 0,
          "price": 1000,
          "size": "s",
          "sku": "B3A3E-UBCY-S"
        },
        {
          "id": 39814344900707,
          "inStock": false,
          "inventoryQuantity": 0,
          "price": 1000,
          "size": "m",
          "sku": "B3A3E-UBCY-M"
        },
        {
          "id": 39814344933475,
          "inStock": true,
          "inventoryQuantity": 1,
          "price": 1000,
          "size": "l",
          "sku": "B3A3E-UBCY-L"
        },
        {
          "id": 39814344966243,
          "inStock": true,
          "inventoryQuantity": 1,
          "price": 1000,
          "size": "xl",
          "sku": "B3A3E-UBCYXL"
        },
        {
          "id": 39814344999011,
          "inStock": true,
          "inventoryQuantity": 1,
          "price": 1000,
          "size": "xxl",
          "sku": "B3A3E-UBCY-XXL"
        }
      ],
      "handle": "gymshark-speed-leggings-navy-ss23",
      "title": "War Pig",
      "description": "<meta charset=\"utf-8\"><p data-mce-fragment=\"1\"><strong data-mce-fragment=\"1\">WALK WITH IT</strong></p><p data-mce-fragment=\"1\"><br data-mce-fragment=\"1\">Your walk requires a companion with spirited energy and enthusiasm, so step out and hit the paths with your Border Terrier. Known for their agility and friendliness, Border Terriers keep pace with you eagerly, making every walk enjoyable and full of adventure.</p><p data-mce-fragment=\"1\"> <br data-mce-fragment=\"1\"></p><p data-mce-fragment=\"1\"><br data-mce-fragment=\"1\">- Small but sturdy and tough<br data-mce-fragment=\"1\">- Affectionate and good-natured<br data-mce-fragment=\"1\">- Highly intelligent and trainable<br data-mce-fragment=\"1\">- Requires regular exercise and loves outdoor activities<br data-mce-fragment=\"1\">- Features a wiry coat that sheds dirt and mud easily<br data-mce-fragment=\"1\">- Coat: Dense undercoat with a harsh wiry outercoat<br data-mce-fragment=\"1\">- Ideal for families and active individuals alike<br data-mce-fragment=\"1\">- Typically stands about 10-11 inches at the shoulder<br data-mce-fragment=\"1\">- SKU: BTWALK2023-PATH</p>",
      "type": "Doggo",
      "gender": ["f"],
      "fit": null,
      "labels": ["wire-haired"],
      "colour": "Tan",
      "price": 1000,
      "compareAtPrice": null,
      "discountPercentage": null,
      "featuredMedia": {
        "admin_graphql_api_id": "gid://shopify/ProductImage/29035954831459",
        "alt": null,
        "created_at": "2022-04-06T15:19:54+01:00",
        "height": 2018,
        "id": 29035954831459,
        "position": 4,
        "product_id": 6732609257572,
        "src": "http://mcp.firestaff.net/doggo/PXL_20240324_130328513.jpg",
        "updated_at": "2022-04-06T15:19:54+01:00",
        "variant_ids": [],
        "width": 1692
      },
      "media": [
        {
          "admin_graphql_api_id": "gid://shopify/ProductImage/29035954831459",
          "alt": null,
          "created_at": "2022-04-06T15:19:54+01:00",
          "height": 2018,
          "id": 29035954831459,
          "position": 1,
          "product_id": 6732609257571,
          "src": "http://mcp.firestaff.net/doggo/PXL_20240331_103521180~2.jpg",
          "updated_at": "2022-04-06T15:19:54+01:00",
          "variant_ids": [],
          "width": 1692
        },
        {
          "admin_graphql_api_id": "gid://shopify/ProductImage/29035954569315",
          "alt": null,
          "created_at": "2022-04-06T15:19:53+01:00",
          "height": 2017,
          "id": 29035954569315,
          "position": 2,
          "product_id": 6732609257571,
          "src": "http://mcp.firestaff.net/doggo/PXL_20240311_163014379.MP.jpg",
          "updated_at": "2022-04-06T15:19:54+01:00",
          "variant_ids": [],
          "width": 1692
        },
        {
          "admin_graphql_api_id": "gid://shopify/ProductImage/29035954700387",
          "alt": null,
          "created_at": "2022-04-06T15:19:54+01:00",
          "height": 2018,
          "id": 29035954700387,
          "position": 3,
          "product_id": 6732609257571,
          "src": "http://mcp.firestaff.net/doggo/PXL_20240315_160825608.jpg",
          "updated_at": "2022-04-06T15:19:54+01:00",
          "variant_ids": [],
          "width": 1692
        },
        {
          "admin_graphql_api_id": "gid://shopify/ProductImage/29035954208867",
          "alt": null,
          "created_at": "2022-04-06T15:19:53+01:00",
          "height": 2018,
          "id": 29035954208867,
          "position": 4,
          "product_id": 6732609257571,
          "src": "http://mcp.firestaff.net/doggo/PXL_20240324_130328513.jpg",
          "updated_at": "2022-04-06T15:19:54+01:00",
          "variant_ids": [],
          "width": 1692
        },
        {
          "admin_graphql_api_id": "gid://shopify/ProductImage/29035954438243",
          "alt": null,
          "created_at": "2022-04-06T15:19:53+01:00",
          "height": 2018,
          "id": 29035954438243,
          "position": 5,
          "product_id": 6732609257571,
          "src": "http://mcp.firestaff.net/doggo/PXL_20240308_201914986~2.jpg",
          "updated_at": "2022-04-06T15:19:54+01:00",
          "variant_ids": [],
          "width": 1692
        },
        {
          "admin_graphql_api_id": "gid://shopify/ProductImage/29035954339939",
          "alt": null,
          "created_at": "2022-04-06T15:19:53+01:00",
          "height": 2018,
          "id": 29035954339939,
          "position": 6,
          "product_id": 6732609257571,
          "src": "http://mcp.firestaff.net/doggo/PXL_20240401_161418922.jpg",
          "updated_at": "2022-04-06T15:19:54+01:00",
          "variant_ids": [],
          "width": 1692
        },
        {
          "admin_graphql_api_id": "gid://shopify/ProductImage/29035954339939",
          "alt": null,
          "created_at": "2022-04-06T15:19:53+01:00",
          "height": 2018,
          "id": 29035954339937,
          "position": 7,
          "product_id": 6732609257571,
          "src": "http://mcp.firestaff.net/doggo/PXL_20240401_164636721.jpg",
          "updated_at": "2022-04-06T15:19:54+01:00",
          "variant_ids": [],
          "width": 1692
        }
      ],
      "objectID": "6732609257572"
    },
    {
      "id": 6732607094885,
      "sku": "B3A3F",
      "inStock": true,
      "sizeInStock": ["m", "l", "xl", "xxl"],
      "availableSizes": [
        {
          "id": 39814339690595,
          "inStock": true,
          "inventoryQuantity": 1,
          "price": 1000,
          "size": "xs",
          "sku": "B3A3E-UBFC-XS"
        },
        {
          "id": 39814339723363,
          "inStock": false,
          "inventoryQuantity": 0,
          "price": 1000,
          "size": "s",
          "sku": "B3A3E-UBFC-S"
        },
        {
          "id": 39814339756131,
          "inStock": true,
          "inventoryQuantity": 1,
          "price": 1000,
          "size": "m",
          "sku": "B3A3E-UBFC-M"
        },
        {
          "id": 39814339788899,
          "inStock": true,
          "inventoryQuantity": 1,
          "price": 1000,
          "size": "l",
          "sku": "B3A3E-UBFC-L"
        },
        {
          "id": 39814339821667,
          "inStock": true,
          "inventoryQuantity": 1,
          "price": 1000,
          "size": "xl",
          "sku": "B3A3E-UBFC-XL"
        },
        {
          "id": 39814339854435,
          "inStock": true,
          "inventoryQuantity": 1,
          "price": 1000,
          "size": "xxl",
          "sku": "B3A3E-UBFC-XXL"
        }
      ],
      "handle": "gymshark-speed-leggings-moonstone-blue-ss24",
      "title": "Majestic Mutt",
      "description": "<meta charset=\"utf-8\"><p data-mce-fragment=\"1\"><strong data-mce-fragment=\"1\">RUN WITH IT</strong></p><p data-mce-fragment=\"1\"><br data-mce-fragment=\"1\">Your run requires a companion with enduring stamina and support, so step out and hit the trails with your German Shepherd. Known for their incredible endurance and versatility, German Shepherds move with you effortlessly, ensuring you can trust in your partner, no matter how far you go.</p><p data-mce-fragment=\"1\"> <br data-mce-fragment=\"1\"></p><p data-mce-fragment=\"1\"><br data-mce-fragment=\"1\">- Intelligent and highly trainable<br data-mce-fragment=\"1\">- Loyal and protective<br data-mce-fragment=\"1\">- Strong and agile<br data-mce-fragment=\"1\">- Requires regular mental and physical exercise<br data-mce-fragment=\"1\">- Features a dense double coat for weather resistance<br data-mce-fragment=\"1\">- Reflective coat markings can be seen in low light<br data-mce-fragment=\"1\">- Coat: 85% Dense undercoat, 15% Coarse outer coat<br data-mce-fragment=\"1\">- Known for their use in various service roles, from police work to search and rescue<br data-mce-fragment=\"1\">- Typically stands 24-26 inches at the shoulder for males, and 22-24 inches for females<br data-mce-fragment=\"1\">- SKU: GSD2023-TRAIL</p>",
      "type" : "Doggo",
      "gender": ["m"],
      "fit": null,
      "labels": null,
      "colour": "Tan and Black",
      "price": 1000,
      "compareAtPrice": null,
      "discountPercentage": null,
      "featuredMedia": {
        "admin_graphql_api_id": "gid://shopify/ProductImage/29031260979299",
        "alt": null,
        "created_at": "2022-04-05T09:55:32+01:00",
        "height": 2018,
        "id": 29031260979299,
        "position": 3,
        "product_id": 6732607094883,
        "src": "http://mcp.firestaff.net/doggo/PXL_20240321_154550997.MP~2.jpg",
        "updated_at": "2022-04-05T09:55:49+01:00",
        "variant_ids": [],
        "width": 1692
      },
      "media": [
        {
          "admin_graphql_api_id": "gid://shopify/ProductImage/29031260979299",
          "alt": null,
          "created_at": "2022-04-05T09:55:32+01:00",
          "height": 2018,
          "id": 29031260979299,
          "position": 1,
          "product_id": 6732607094883,
          "src": "http://mcp.firestaff.net/doggo/PXL_20240305_092956400.jpg",
          "updated_at": "2022-04-05T09:55:49+01:00",
          "variant_ids": [],
          "width": 1692
        },
        {
          "admin_graphql_api_id": "gid://shopify/ProductImage/29031260815459",
          "alt": null,
          "created_at": "2022-04-05T09:55:30+01:00",
          "height": 2018,
          "id": 29031260815459,
          "position": 2,
          "product_id": 6732607094883,
          "src": "http://mcp.firestaff.net/doggo/PXL_20240320_171028451.jpg",
          "updated_at": "2022-04-05T09:55:49+01:00",
          "variant_ids": [],
          "width": 1692
        },
        {
          "admin_graphql_api_id": "gid://shopify/ProductImage/29031260848227",
          "alt": null,
          "created_at": "2022-04-05T09:55:30+01:00",
          "height": 2018,
          "id": 29031260848227,
          "position": 3,
          "product_id": 6732607094883,
          "src": "http://mcp.firestaff.net/doggo/PXL_20240321_154550997.MP~2.jpg",
          "updated_at": "2022-04-05T09:55:49+01:00",
          "variant_ids": [],
          "width": 1692
        },
        {
          "admin_graphql_api_id": "gid://shopify/ProductImage/29031260880995",
          "alt": null,
          "created_at": "2022-04-05T09:55:31+01:00",
          "height": 2018,
          "id": 29031260880995,
          "position": 4,
          "product_id": 6732607094883,
          "src": "http://mcp.firestaff.net/doggo/PXL_20240411_213810789~2.jpg",
          "updated_at": "2022-04-05T09:55:32+01:00",
          "variant_ids": [],
          "width": 1692
        },
        {
          "admin_graphql_api_id": "gid://shopify/ProductImage/29031260913763",
          "alt": null,
          "created_at": "2022-04-05T09:55:31+01:00",
          "height": 2018,
          "id": 29031260913763,
          "position": 5,
          "product_id": 6732607094883,
          "src": "http://mcp.firestaff.net/doggo/PXL_20240413_202731506.MP.jpg",
          "updated_at": "2022-04-05T09:55:32+01:00",
          "variant_ids": [],
          "width": 1692
        }
      ],
      "objectID": "6732607094885"
    },
    {
      "id": 6732609257573,
      "sku": "B3A3B",
      "inStock": true,
      "sizeInStock": ["xs", "l", "xl", "xxl"],
      "availableSizes": [
        {
          "id": 39814344835171,
          "inStock": true,
          "inventoryQuantity": 1,
          "price": 1000,
          "size": "xs",
          "sku": "B3A3E-UBCY-XS"
        },
        {
          "id": 39814344867939,
          "inStock": false,
          "inventoryQuantity": 0,
          "price": 1000,
          "size": "s",
          "sku": "B3A3E-UBCY-S"
        },
        {
          "id": 39814344900707,
          "inStock": false,
          "inventoryQuantity": 0,
          "price": 1000,
          "size": "m",
          "sku": "B3A3E-UBCY-M"
        },
        {
          "id": 39814344933475,
          "inStock": true,
          "inventoryQuantity": 1,
          "price": 1000,
          "size": "l",
          "sku": "B3A3E-UBCY-L"
        },
        {
          "id": 39814344966243,
          "inStock": true,
          "inventoryQuantity": 1,
          "price": 1000,
          "size": "xl",
          "sku": "B3A3E-UBCYXL"
        },
        {
          "id": 39814344999011,
          "inStock": true,
          "inventoryQuantity": 1,
          "price": 1000,
          "size": "xxl",
          "sku": "B3A3E-UBCY-XXL"
        }
      ],
      "handle": "gymshark-speed-leggings-navy-ss24",
      "title": "Cora Border Terrier",
      "description": "<meta charset=\"utf-8\"><p data-mce-fragment=\"1\"><strong data-mce-fragment=\"1\">WALK WITH IT</strong></p><p data-mce-fragment=\"1\"><br data-mce-fragment=\"1\">Your walk requires a companion with spirited energy and enthusiasm, so step out and hit the paths with your Border Terrier. Known for their agility and friendliness, Border Terriers keep pace with you eagerly, making every walk enjoyable and full of adventure.</p><p data-mce-fragment=\"1\"> <br data-mce-fragment=\"1\"></p><p data-mce-fragment=\"1\"><br data-mce-fragment=\"1\">- Small but sturdy and tough<br data-mce-fragment=\"1\">- Affectionate and good-natured<br data-mce-fragment=\"1\">- Highly intelligent and trainable<br data-mce-fragment=\"1\">- Requires regular exercise and loves outdoor activities<br data-mce-fragment=\"1\">- Features a wiry coat that sheds dirt and mud easily<br data-mce-fragment=\"1\">- Coat: Dense undercoat with a harsh wiry outercoat<br data-mce-fragment=\"1\">- Ideal for families and active individuals alike<br data-mce-fragment=\"1\">- Typically stands about 10-11 inches at the shoulder<br data-mce-fragment=\"1\">- SKU: BTWALK2023-PATH</p>",
      "type": "Doggo",
      "gender": ["f"],
      "fit": null,
      "labels": ["wire-haired"],
      "colour": "Tan",
      "price": 1000,
      "compareAtPrice": null,
      "discountPercentage": null,
      "featuredMedia": {
        "admin_graphql_api_id": "gid://shopify/ProductImage/29035954831459",
        "alt": null,
        "created_at": "2022-04-06T15:19:54+01:00",
        "height": 2018,
        "id": 29035954831459,
        "position": 2,
        "product_id": 6732609257573,
        "src": "http://mcp.firestaff.net/doggo/PXL_20240311_163014379.MP.jpg",
        "updated_at": "2022-04-06T15:19:54+01:00",
        "variant_ids": [],
        "width": 1692
      },
      "media": [
        {
          "admin_graphql_api_id": "gid://shopify/ProductImage/29035954831459",
          "alt": null,
          "created_at": "2022-04-06T15:19:54+01:00",
          "height": 2018,
          "id": 29035954831459,
          "position": 1,
          "product_id": 6732609257571,
          "src": "http://mcp.firestaff.net/doggo/PXL_20240331_103521180~2.jpg",
          "updated_at": "2022-04-06T15:19:54+01:00",
          "variant_ids": [],
          "width": 1692
        },
        {
          "admin_graphql_api_id": "gid://shopify/ProductImage/29035954569315",
          "alt": null,
          "created_at": "2022-04-06T15:19:53+01:00",
          "height": 2017,
          "id": 29035954569315,
          "position": 2,
          "product_id": 6732609257571,
          "src": "http://mcp.firestaff.net/doggo/PXL_20240311_163014379.MP.jpg",
          "updated_at": "2022-04-06T15:19:54+01:00",
          "variant_ids": [],
          "width": 1692
        },
        {
          "admin_graphql_api_id": "gid://shopify/ProductImage/29035954700387",
          "alt": null,
          "created_at": "2022-04-06T15:19:54+01:00",
          "height": 2018,
          "id": 29035954700387,
          "position": 3,
          "product_id": 6732609257571,
          "src": "http://mcp.firestaff.net/doggo/PXL_20240315_160825608.jpg",
          "updated_at": "2022-04-06T15:19:54+01:00",
          "variant_ids": [],
          "width": 1692
        },
        {
          "admin_graphql_api_id": "gid://shopify/ProductImage/29035954208867",
          "alt": null,
          "created_at": "2022-04-06T15:19:53+01:00",
          "height": 2018,
          "id": 29035954208867,
          "position": 4,
          "product_id": 6732609257571,
          "src": "http://mcp.firestaff.net/doggo/PXL_20240324_130328513.jpg",
          "updated_at": "2022-04-06T15:19:54+01:00",
          "variant_ids": [],
          "width": 1692
        },
        {
          "admin_graphql_api_id": "gid://shopify/ProductImage/29035954438243",
          "alt": null,
          "created_at": "2022-04-06T15:19:53+01:00",
          "height": 2018,
          "id": 29035954438243,
          "position": 5,
          "product_id": 6732609257571,
          "src": "http://mcp.firestaff.net/doggo/PXL_20240308_201914986~2.jpg",
          "updated_at": "2022-04-06T15:19:54+01:00",
          "variant_ids": [],
          "width": 1692
        },
        {
          "admin_graphql_api_id": "gid://shopify/ProductImage/29035954339939",
          "alt": null,
          "created_at": "2022-04-06T15:19:53+01:00",
          "height": 2018,
          "id": 29035954339939,
          "position": 6,
          "product_id": 6732609257571,
          "src": "http://mcp.firestaff.net/doggo/PXL_20240401_161418922.jpg",
          "updated_at": "2022-04-06T15:19:54+01:00",
          "variant_ids": [],
          "width": 1692
        },
        {
          "admin_graphql_api_id": "gid://shopify/ProductImage/29035954339939",
          "alt": null,
          "created_at": "2022-04-06T15:19:53+01:00",
          "height": 2018,
          "id": 29035954339937,
          "position": 7,
          "product_id": 6732609257571,
          "src": "http://mcp.firestaff.net/doggo/PXL_20240401_164636721.jpg",
          "updated_at": "2022-04-06T15:19:54+01:00",
          "variant_ids": [],
          "width": 1692
        }
      ],
      "objectID": "6732609257573"
    },
    {
      "id": 6732609257574,
      "sku": "B3A3A",
      "inStock": true,
      "sizeInStock": ["xs", "l", "xl", "xxl"],
      "availableSizes": [
        {
          "id": 39814344835171,
          "inStock": true,
          "inventoryQuantity": 1,
          "price": 1000,
          "size": "xs",
          "sku": "B3A3E-UBCY-XS"
        },
        {
          "id": 39814344867939,
          "inStock": false,
          "inventoryQuantity": 0,
          "price": 1000,
          "size": "s",
          "sku": "B3A3E-UBCY-S"
        },
        {
          "id": 39814344900707,
          "inStock": false,
          "inventoryQuantity": 0,
          "price": 1000,
          "size": "m",
          "sku": "B3A3E-UBCY-M"
        },
        {
          "id": 39814344933475,
          "inStock": true,
          "inventoryQuantity": 1,
          "price": 1000,
          "size": "l",
          "sku": "B3A3E-UBCY-L"
        },
        {
          "id": 39814344966243,
          "inStock": true,
          "inventoryQuantity": 1,
          "price": 1000,
          "size": "xl",
          "sku": "B3A3E-UBCYXL"
        },
        {
          "id": 39814344999011,
          "inStock": true,
          "inventoryQuantity": 1,
          "price": 1000,
          "size": "xxl",
          "sku": "B3A3E-UBCY-XXL"
        }
      ],
      "handle": "gymshark-speed-leggings-navy-ss22",
      "title": "Cora Border Terrier",
      "description": "<meta charset=\"utf-8\"><p data-mce-fragment=\"1\"><strong data-mce-fragment=\"1\">WALK WITH IT</strong></p><p data-mce-fragment=\"1\"><br data-mce-fragment=\"1\">Your walk requires a companion with spirited energy and enthusiasm, so step out and hit the paths with your Border Terrier. Known for their agility and friendliness, Border Terriers keep pace with you eagerly, making every walk enjoyable and full of adventure.</p><p data-mce-fragment=\"1\"> <br data-mce-fragment=\"1\"></p><p data-mce-fragment=\"1\"><br data-mce-fragment=\"1\">- Small but sturdy and tough<br data-mce-fragment=\"1\">- Affectionate and good-natured<br data-mce-fragment=\"1\">- Highly intelligent and trainable<br data-mce-fragment=\"1\">- Requires regular exercise and loves outdoor activities<br data-mce-fragment=\"1\">- Features a wiry coat that sheds dirt and mud easily<br data-mce-fragment=\"1\">- Coat: Dense undercoat with a harsh wiry outercoat<br data-mce-fragment=\"1\">- Ideal for families and active individuals alike<br data-mce-fragment=\"1\">- Typically stands about 10-11 inches at the shoulder<br data-mce-fragment=\"1\">- SKU: BTWALK2023-PATH</p>",
      "type": "Doggo",
      "gender": ["f"],
      "fit": null,
      "labels": ["wire-haired"],
      "colour": "Tan",
      "price": 1000,
      "compareAtPrice": null,
      "discountPercentage": null,
      "featuredMedia": {
        "admin_graphql_api_id": "gid://shopify/ProductImage/29035954831459",
        "alt": null,
        "created_at": "2022-04-06T15:19:54+01:00",
        "height": 2018,
        "id": 29035954831459,
        "position": 3,
        "product_id": 6732609257574,
        "src": "http://mcp.firestaff.net/doggo/PXL_20240315_160825608.jpg",
        "updated_at": "2022-04-06T15:19:54+01:00",
        "variant_ids": [],
        "width": 1692
      },
      "media": [
        {
          "admin_graphql_api_id": "gid://shopify/ProductImage/29035954831459",
          "alt": null,
          "created_at": "2022-04-06T15:19:54+01:00",
          "height": 2018,
          "id": 29035954831459,
          "position": 1,
          "product_id": 6732609257571,
          "src": "http://mcp.firestaff.net/doggo/PXL_20240331_103521180~2.jpg",
          "updated_at": "2022-04-06T15:19:54+01:00",
          "variant_ids": [],
          "width": 1692
        },
        {
          "admin_graphql_api_id": "gid://shopify/ProductImage/29035954569315",
          "alt": null,
          "created_at": "2022-04-06T15:19:53+01:00",
          "height": 2017,
          "id": 29035954569315,
          "position": 2,
          "product_id": 6732609257571,
          "src": "http://mcp.firestaff.net/doggo/PXL_20240311_163014379.MP.jpg",
          "updated_at": "2022-04-06T15:19:54+01:00",
          "variant_ids": [],
          "width": 1692
        },
        {
          "admin_graphql_api_id": "gid://shopify/ProductImage/29035954700387",
          "alt": null,
          "created_at": "2022-04-06T15:19:54+01:00",
          "height": 2018,
          "id": 29035954700387,
          "position": 3,
          "product_id": 6732609257571,
          "src": "http://mcp.firestaff.net/doggo/PXL_20240315_160825608.jpg",
          "updated_at": "2022-04-06T15:19:54+01:00",
          "variant_ids": [],
          "width": 1692
        },
        {
          "admin_graphql_api_id": "gid://shopify/ProductImage/29035954208867",
          "alt": null,
          "created_at": "2022-04-06T15:19:53+01:00",
          "height": 2018,
          "id": 29035954208867,
          "position": 4,
          "product_id": 6732609257571,
          "src": "http://mcp.firestaff.net/doggo/PXL_20240324_130328513.jpg",
          "updated_at": "2022-04-06T15:19:54+01:00",
          "variant_ids": [],
          "width": 1692
        },
        {
          "admin_graphql_api_id": "gid://shopify/ProductImage/29035954438243",
          "alt": null,
          "created_at": "2022-04-06T15:19:53+01:00",
          "height": 2018,
          "id": 29035954438243,
          "position": 5,
          "product_id": 6732609257571,
          "src": "http://mcp.firestaff.net/doggo/PXL_20240308_201914986~2.jpg",
          "updated_at": "2022-04-06T15:19:54+01:00",
          "variant_ids": [],
          "width": 1692
        },
        {
          "admin_graphql_api_id": "gid://shopify/ProductImage/29035954339939",
          "alt": null,
          "created_at": "2022-04-06T15:19:53+01:00",
          "height": 2018,
          "id": 29035954339939,
          "position": 6,
          "product_id": 6732609257571,
          "src": "http://mcp.firestaff.net/doggo/PXL_20240401_161418922.jpg",
          "updated_at": "2022-04-06T15:19:54+01:00",
          "variant_ids": [],
          "width": 1692
        },
        {
          "admin_graphql_api_id": "gid://shopify/ProductImage/29035954339939",
          "alt": null,
          "created_at": "2022-04-06T15:19:53+01:00",
          "height": 2018,
          "id": 29035954339937,
          "position": 7,
          "product_id": 6732609257571,
          "src": "http://mcp.firestaff.net/doggo/PXL_20240401_164636721.jpg",
          "updated_at": "2022-04-06T15:19:54+01:00",
          "variant_ids": [],
          "width": 1692
        }
      ],
      "objectID": "6732609257574"
    }
    ]""".trimMargin()

val emptyJson = """{
      "id": 0,
      "sku": "",
      "inStock": false,
      "sizeInStock": [],
      "availableSizes": [],
      "handle": "",
      "title": "",
      "description": "",
      "type": "",
      "gender": [],
      "fit": null,
      "labels": [],
      "colour": "",
      "price": 0,
      "compareAtPrice": null,
      "discountPercentage": null,
      "featuredMedia": {
        "admin_graphql_api_id": "",
        "alt": null,
        "created_at": "",
        "height": 0,
        "id": 0,
        "position": 0,
        "product_id": 0,
        "src": "",
        "updated_at": "",
        "variant_ids": [],
        "width": 0
      },
      "media": [],
      "objectID": ""
}"""

val trueEmptyJson = """{
    "id": ""
}"""

