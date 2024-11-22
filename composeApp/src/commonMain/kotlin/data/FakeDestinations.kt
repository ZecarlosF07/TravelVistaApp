package data

import model.Destination

object FakeDestinations {
    val destinations = arrayListOf<Destination>().apply {
        add(
            Destination(
                id = 1,
                thumbnail = FakeImages.randomThumbnailUrl(),
                title = "Indonesia Mountain",
                description = "The mighty Rinjani mountain of Gunung Rinjani is a massive volcano which towers over the island of Lombok. A climb to the top is one of the most exhilarating experiences you can have in Indonesia. At 3,726 meters tall, Gunung Rinjani is the second highest mountain in Indonesia...",
                rating = 4.3f,
                location = "Ica, Perú",
                price = "$48",
                type = "Turismo",
                category = FakeCategories.categories[1],
                image = FakeImages.randomImageUrls(6),
                dates = arrayListOf("20 Dec - 24 Dec 2024", "25 Dec - 26 Dec 2024", "27 Dec - 30 Dec 2024"),
                meetingPoints = arrayListOf("Serang", "Baranga", "Manchester", "Folio"),
                facilities = arrayListOf("Transport", "Simaksi", "Coffee Break", "Meals during trekking","Camping tents", "P3K", "Officially recognized mountain guide", "Guide during trekking", "Folio"),
                via = "Peshawar",
                estimation = "1 WEEK"
            )
        )
        add(
            Destination(
                id = 1,
                thumbnail = FakeImages.randomThumbnailUrl(),
                title = "Laguna de Huacachina",
                description = "The mighty Rinjani mountain of Gunung Rinjani is a massive volcano which towers over the island of Lombok. A climb to the top is one of the most exhilarating experiences you can have in Indonesia. At 3,726 meters tall, Gunung Rinjani is the second highest mountain in Indonesia...",
                rating = 4.0f,
                location = "Ica, Perú",
                price = "$30",
                type = "Turismo",
                category = FakeCategories.categories[1],
                image =FakeImages.randomImageUrls(5),
                dates = arrayListOf("20 Dec - 24 Dec 2024", "25 Dec - 26 Dec 2024", "27 Dec - 30 Dec 2024"),
                meetingPoints = arrayListOf("Serang", "Baranga", "Manchester", "Folio"),
                facilities = arrayListOf("Transport", "Simaksi", "Coffee Break", "Meals during trekking","Camping tents", "P3K", "Officially recognized mountain guide", "Guide during trekking", "Folio"),
                via = "Peshawar",
                estimation = "1 WEEK"
            )
        )
        add(
            Destination(
                id = 1,
                thumbnail = FakeImages.randomThumbnailUrl(),
                title = "Lombok Mountain",
                description = "The mighty Rinjani mountain of Gunung Rinjani is a massive volcano which towers over the island of Lombok. A climb to the top is one of the most exhilarating experiences you can have in Indonesia. At 3,726 meters tall, Gunung Rinjani is the second highest mountain in Indonesia...",
                rating = 3.7f,
                location = "Pisco, Perú",
                price = "$30",
                type = "Turismo",
                category = FakeCategories.categories[2],
                image = FakeImages.randomImageUrls(3),
                dates = arrayListOf("20 Dec - 24 Dec 2024", "25 Dec - 26 Dec 2024", "27 Dec - 30 Dec 2024"),
                meetingPoints = arrayListOf("Serang", "Baranga", "Manchester", "Folio"),
                facilities = arrayListOf("Transport", "Simaksi", "Coffee Break", "Meals during trekking","Camping tents", "P3K", "Officially recognized mountain guide", "Guide during trekking", "Folio"),
                via = "Karachi",
                estimation = "1 WEEK"
            )
        )
        add(
            Destination(
                id = 1,
                thumbnail = FakeImages.randomThumbnailUrl(),
                title = "Lineas de Nazca",
                description = "The mighty Rinjani mountain of Gunung Rinjani is a massive volcano which towers over the island of Lombok. A climb to the top is one of the most exhilarating experiences you can have in Indonesia. At 3,726 meters tall, Gunung Rinjani is the second highest mountain in Indonesia...",
                rating = 2.7f,
                location = "Nazca, Perú",
                price = "$18",
                type = "Festividad",
                category = FakeCategories.categories[3],
                image = FakeImages.randomImageUrls(3),
                dates = arrayListOf("20 Dec - 24 Dec 2024", "25 Dec - 26 Dec 2024", "27 Dec - 30 Dec 2024"),
                meetingPoints = arrayListOf("Serang", "Baranga", "Manchester", "Folio"),
                facilities = arrayListOf("Transport", "Simaksi", "Coffee Break", "Meals during trekking","Camping tents", "P3K", "Officially recognized mountain guide", "Guide during trekking", "Folio"),
                via = "Lahore",
                estimation = "1 Day"
            )
        )
        add(
            Destination(
                id = 1,
                thumbnail = FakeImages.randomThumbnailUrl(),
                title = "Rinjani Mountain",
                description = "The mighty Rinjani mountain of Gunung Rinjani is a massive volcano which towers over the island of Lombok. A climb to the top is one of the most exhilarating experiences you can have in Indonesia. At 3,726 meters tall, Gunung Rinjani is the second highest mountain in Indonesia...",
                rating = 2.7f,
                location = "Chincha, Perú",
                price = "$18",
                type = "Festividad",
                category = FakeCategories.categories[4],
                image = FakeImages.randomImageUrls(3),
                dates = arrayListOf("20 Dec - 24 Dec 2024", "25 Dec - 26 Dec 2024", "27 Dec - 30 Dec 2024"),
                meetingPoints = arrayListOf("Serang", "Baranga", "Manchester", "Folio"),
                facilities = arrayListOf("Transport", "Simaksi", "Coffee Break", "Meals during trekking","Camping tents", "P3K", "Officially recognized mountain guide", "Guide during trekking", "Folio"),
                via = "Lahore",
                estimation = "1 Day"
            )
        )
        add(
            Destination(
                id = 1,
                thumbnail = FakeImages.randomThumbnailUrl(),
                title = "Hotel Cielo",
                description = "The mighty Rinjani mountain of Gunung Rinjani is a massive volcano which towers over the island of Lombok. A climb to the top is one of the most exhilarating experiences you can have in Indonesia. At 3,726 meters tall, Gunung Rinjani is the second highest mountain in Indonesia...",
                rating = 2.7f,
                location = "Pisco, Perú",
                price = "$18",
                type = "Hoteles",
                category = FakeCategories.categories[2],
                image = FakeImages.randomImageUrls(3),
                dates = arrayListOf("20 Dec - 24 Dec 2024", "25 Dec - 26 Dec 2024", "27 Dec - 30 Dec 2024"),
                meetingPoints = arrayListOf("Serang", "Baranga", "Manchester", "Folio"),
                facilities = arrayListOf("Transport", "Simaksi", "Coffee Break", "Meals during trekking","Camping tents", "P3K", "Officially recognized mountain guide", "Guide during trekking", "Folio"),
                via = "Lahore",
                estimation = "1 Day"
            )
        )
    }
}