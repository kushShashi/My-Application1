package me.shashikushwaha.myapplication1.di.model

class ModelProduct (title: String?, code: String?, price: Int?) {
    private var title: String
    private var code: String
    private var price: Int
   // private var image: String


    init {
        this.title = title!!
        this.code = code!!
        this.price = price!!
       // this.image=image !!
    }

 /*   fun getImage(): String? {
        return image
    }
    fun setImage(name: String?) {
        title = name!!
    }*/

    fun getTitle(): String? {
        return title
    }
    fun setTitle(name: String?) {
        title = name!!
    }

    fun getCode(): String? {
        return code
    }
    fun setCode(name: String?) {
        code = name!!
    }

    fun getPrice(): Int? {
        return price
    }
    fun setPrice(name: Int?) {
        price = name!!
    }
}