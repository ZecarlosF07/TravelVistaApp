package data

import model.Category
import travelvista.composeapp.generated.resources.Res
import travelvista.composeapp.generated.resources.category1
import travelvista.composeapp.generated.resources.category2
import travelvista.composeapp.generated.resources.category3
import travelvista.composeapp.generated.resources.category4
import travelvista.composeapp.generated.resources.star

object FakeCategories {

    val categories = arrayListOf<Category>().apply {
        add(Category(0, "All", Res.drawable.star))
        add(Category(1, "Mountain", Res.drawable.category1))
        add(Category(2, "Waterfall", Res.drawable.category2))
        add(Category(3, "River", Res.drawable.category3))
        add(Category(4, "Lake", Res.drawable.category4))
    }

}
