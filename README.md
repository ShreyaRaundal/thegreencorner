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


    
Add plant
POST 
http://localhost:8080/plants/save
<img width="1321" height="703" alt="image" src="https://github.com/user-attachments/assets/a622e9b2-1105-4b61-8c1a-82db8c6590cc" />

<img width="1361" height="684" alt="image" src="https://github.com/user-attachments/assets/6bdf1a68-e682-44f3-ba23-adcb40a6be49" />
get all
GET
http://localhost:8080/plants/all
<img width="1337" height="697" alt="image" src="https://github.com/user-attachments/assets/f6333d42-fa55-4554-b5da-d58bd20afe8b" />
<img width="1338" height="648" alt="image" src="https://github.com/user-attachments/assets/9226e671-bf73-4449-a549-9093f6748576" />

get review by id
POST
http://localhost:8080/plants/1/review
{
  "username": "MahiGreen",
  "rating": 5,
  "comment": "Beautiful healthy plant, great packaging!",
  "productDelivered": true,
  "dateTime": "2025-01-01T12:30:00",
  "likes": 10,
  "dislikes": 0
}
<img width="1349" height="707" alt="image" src="https://github.com/user-attachments/assets/7e6e39af-2c3e-4f45-bb21-d322a267f712" />

<img width="1362" height="654" alt="image" src="https://github.com/user-attachments/assets/77252895-cac0-4daa-bc53-2e49ace78023" />


    Equipment
    {
      "id": "1",
      "name": "Purpose Seed Starter Kits",
      "description": "Score each cause. Quality throughout beautiful instead.",
      "price": 3489.26,
      "rating": 4.3,
      "reviews": [
        {
          "username": "Anthony95",
          "rating": 3.4,
          "comment": "Discussion own night respond red.",
          "productDelivered": true,
          "dateTime": "2025-01-01T15:16:27",
          "likes": 67,
          "dislikes": 0
        },
        {
          "username": "Jeffrey74",
          "rating": 4.9,
          "comment": "Everything thank serve civil institution everyone democratic shake.",
          "productDelivered": true,
          "dateTime": "2025-01-01T03:43:16",
          "likes": 40,
          "dislikes": 2
        }
      ],
      "categories": [
        "Indoor Gardening Accessories",
        "Seed Starter Kits"
      ],
      "seller": {
        "name": "Hoffman, Baker and Richards",
        "address": {
          "street": "Cox Dam",
          "city": "Nashik",
          "state": "Maharashtra",
          "country": "India",
          "pincode": "67285"
        }
      },
      "availability": "Out of Stock",
      "quantityAvailable": 171,
      "tags": [
        "minute",
        "benefit",
        "Gardening Tools"
      ],
      "shippingPolicy": "Ships within 7 business days across Maharashtra.",
      "refundPolicy": "No refunds available for this product.",
      "primaryImage": "https://m.media-amazon.com/images/I/51+ZzcAqSEL._SY300_SX300_.jpg",
      "secondaryImages": [
        "https://m.media-amazon.com/images/I/51+ZzcAqSEL._SY300_SX300_.jpg",
        "https://m.media-amazon.com/images/I/51+ZzcAqSEL._SY300_SX300_.jpg",
        "https://m.media-amazon.com/images/I/51xKeP+fbsL._SX569_.jpg",
        "https://m.media-amazon.com/images/I/81WkGgAgZJL._SX569_.jpg"
      ]
    }
