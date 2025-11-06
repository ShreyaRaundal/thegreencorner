# thegreencorner
perform crudoperation
signin -signup controller

json object:
plant: {
      "name": "Rose",
      "id": "1",
      "description": "Roses are beautiful flowering plants belonging to the Rosaceae family. Popular in gardens, they are loved for their vibrant colors and aromatic fragrance. Maharashtra, particularly Pune, has ideal conditions for growing roses due to its moderate climate.",
      "price": 12,
      "discountPrice": 10,
      "rating": 4.5,
      "reviews": [
@OneToMany
List<review>
       review: {
          "username": "AaravGardener",
          "rating": 5,
          "comment": "Absolutely love this rose! The vibrant red color brightens up my garden.",
          "productDelivered": true,
          "dateTime": "2024-11-20T10:15:00",
          "likes": 42,
          "dislikes": 2
        },
        {
          "username": "MahiGreen",
          "rating": 5,
          "comment": "Great product. It was well-packaged, and the plant arrived in perfect condition.",
          "productDelivered": true,
          "dateTime": "2024-11-19T15:48:00",
          "likes": 35,
          "dislikes": 1
        }
      ],
      "totalSalesLastMonth": 50,
      "sellerName": "Pune Plant Co.",
      "sellerAddress": {
        "street": "Bhosale Nagar",
        "city": "Pune",
        "state": "Maharashtra",
        "country": "India",
        "pincode": "411007"
      },
      "availability": "In Stock",
      "quantityAvailable": 100,
      "categories": [
        "Outdoor Plants",
        "Indoor Plants",
        "Flowering Plants"
      ],
      "sunlightRequirement": "Full Sun",
      "moistureRequirement": "Medium",
      "soilType": "Loamy soil",
      "season": "Winter, Spring",
      "growthRate": "Moderate",
      "potSizeRequired": "Medium",
      "genus": "Rosa",
      "localName": "गुलाब (Gulab)",
      "regionalName": "गुलाब (Gulab)",
      "biologicalName": "Rosa spp.",
      "botanicalName": "Rosa hybrida",
      "tags": [
        "Gift Ideas",
        "Flowering Plants",
        "Indoor Decor"
      ],
      "shippingStates": [
        "Maharashtra",
        "Goa",
        "Karnataka"
      ],
      "primaryImage": "https://nurserylive.com/cdn/shop/products/nurserylive-miniature-rose-button-rose-yellow-plant_600x600.jpg?v=1634224134",
      "secondaryImages": [
        "https://nurserylive.com/cdn/shop/products/nurserylive-g-rose-orange-plant_600x600.jpg?v=1634227422",
        "https://nurserylive.com/cdn/shop/products/nurserylive-rose-orange-plant-1_540x720.jpg?v=1634227420",
        "https://nurserylive.com/cdn/shop/products/nurserylive-rose-orange-plant-4_540x720.jpg?v=1634227413",
        "https://nurserylive.com/cdn/shop/products/nurserylive-g-rose-orange-plant_600x600.jpg?v=1634227422"
      ],
      "shoppingPolicy": "Ships within 3-5 business days across Pune and Maharashtra.",
      "refundPolicy": "30-day refund policy with original receipt. Free return pickup within Pune city limits."
    }
