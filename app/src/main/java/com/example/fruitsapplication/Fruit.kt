package com.example.fruitsapplication

import android.os.Parcel
import android.os.Parcelable

data class Fruit(
    val fruitNames: String?,
    val fruitImages: Int,
    val shortDescription: String?): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readInt(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(fruitNames)
        parcel.writeInt(fruitImages)
        parcel.writeString(shortDescription)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Fruit> {
        override fun createFromParcel(parcel: Parcel): Fruit {
            return Fruit(parcel)
        }

        override fun newArray(size: Int): Array<Fruit?> {
            return arrayOfNulls(size)
        }
    }
}
