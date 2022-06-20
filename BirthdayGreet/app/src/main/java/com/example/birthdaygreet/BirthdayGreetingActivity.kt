package com.example.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable

class BirthdayGreetingActivity() : AppCompatActivity(), Parcelable {
    constructor(parcel: Parcel) : this() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<BirthdayGreetingActivity> {
        override fun createFromParcel(parcel: Parcel): BirthdayGreetingActivity {
            return BirthdayGreetingActivity(parcel)
        }

        override fun newArray(size: Int): Array<BirthdayGreetingActivity?> {
            return arrayOfNulls(size)
        }
    }
}