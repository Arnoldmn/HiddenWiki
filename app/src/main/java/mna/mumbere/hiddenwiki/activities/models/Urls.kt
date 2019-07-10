package mna.mumbere.hiddenwiki.activities.models

object Urls {

    val BaseUrl = "https://en.wikipedia.org/w/api.php"

    fun getSearchUrl(item: String, skip: Int, take: Int): String {

        return BaseUrl + "?action=query" +
                "&formatversion=2" +
                "&generator=prefixsearch" +
                "&gpssearch=$item" +
                "&gpslimit=$take" +
                "&gpsoffset=$skip" +
                "&prop=pageimages|info"  +
                "piprop=thumbnail|url" +
                "&pithumbnailsize=200" +
                "&pilimit=$take" +
                "&wbptterms=description" +
                "&format=json" +
                "&inprop=url"
    }

    fun getRandomUrl(take:Int) : String{
        return  BaseUrl + "?action=query" +
                "&formatversion=2" +
                "&generator=random" +
                "&grnnamespace=0" +
                "&prop=pageimages|info"  +
                "&gnrlimit=$take" +
                "inprop=url" +
                "&pithumbnailsize=200" 
    }
}