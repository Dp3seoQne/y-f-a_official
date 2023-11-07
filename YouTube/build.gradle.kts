dependencies {
    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.recyclerview:recyclerview:1.3.2")
}
// use an integer for version numbers
version = 1

cloudstream {
    // All of these properties are optional, you can safely remove them

    description = "Watch freely available movies from YouTube without any Advertisements in between videos due to API v3"
    authors = listOf("YF")

    /**
     * Status int as the following:
     * 0: Down
     * 1: Ok
     * 2: Slow
     * 3: Beta only
     * */
    status = 1

    tvTypes = listOf("Movies")

    requiresResources = true
    language = "en"

    // random cc logo i found
    iconUrl = "https://pngimg.com/uploads/youtube/youtube_PNG102349.png"
}