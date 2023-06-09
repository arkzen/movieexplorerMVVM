# MovieList App
Thi is a production level Android project that uses proper MVVM architecture and implements various Android components such as RecyclerView, Retrofit, LiveData, and Glide to fetch and display the top rated movies using the TMDB API.

## Features

- Displays a list of top rated movies with their posters and release dates. 
- Allows users to scroll through the list of movies.
- Uses Retrofit to fetch data from the TMDB API. Uses LiveData to observe changes to the movie data and update the UI accordingly.
- Uses Glide to load and cache images.
- Uses MVVM architecture to separate concerns and promote testability.
- Uses ViewModel to handle UI-related data.

## Getting Started
To get started with the project, follow these steps:
- Clone the project
```bash
  git clone https://github.com/arkzen/movieexplorerMVVM.git
```

- Open the project in Android Studio.
- You will need to obtain an API key from the TMDB website.
- Build and run the project on an Android device or emulator.

## Contributing
Contributions to the project are welcome. If you have any suggestions or find any bugs, please create an issue or submit a pull request.

## Dependencies
The MovieList App uses the following dependencies:
- Retrofit for making network requests.
- Gson for parsing JSON responses.
- OkHttp for logging network requests.
- Glide for loading and caching images.
