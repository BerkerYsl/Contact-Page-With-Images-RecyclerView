package com.berkeruysal.recyclerviewprojectwimage

data class Contact(val name:String,val age:Int)
{   //random image aldık picsum sitesinden ve age değişkeni ile sonundaki sayıyı sürekli artırarak random olarka resimlerin değişmesiin sağladık
    //ancak bu resimleri internetten indirecğeimiz için her seferinde android manifest'e bunu bildirmemiz gerekiyor izin olarak
    val imageUrl="https://picsum.photos/200?random=$age"
}