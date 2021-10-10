# AirQualityIndex

AirQualityIndex is a socket based app which provided the latest 'Air Quality Index' of the major cites on India.

Features
- Websokcets
- Navigation Component
- DataBinding
- Kotlin
- MVVM
- Coroutines
- Room

## Features

- AQI is updated every 30 seconds so users can have the latest data
- Color coding is used to represent the AIQ for easy to understand.


- [Download apk](https://github.com/Parikshit-Singh-Shekhawat/AQISample/tree/master/app/build/outputs/apk/debug) 

## Working 

App uses MVVP architacture pattern and repository design pattern.

There are two main screens in this app. Main FrgamentHome uses the ViewModel to share the data with FragmentHistory.

Web socket is created in MainAcitivity and data from socket is used in HomeActivity via ViewModel. Data form socket is refreshed every 30 seconds. Not all cities are received in one message, the messge is saved in Room db and latest data for every city is retrieved from db.

Color pattern is used to display the AQI for cities. Also the latest updated time is being display with the city name.

In FragmentHistory the data from particular city is retreived and used to display the graph. 10 latest entries are used in this.

Moving from FragmentHome to FrgamentHistory navigation component is used. 

To display the chart MpAndroidChat library is used in app. 

Database access is done using Repository pattern.

