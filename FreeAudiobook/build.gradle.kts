version = 0


cloudstream {
    language = "en"
    // All of these properties are optional, you can safely remove them

    description = "Listen to free Audiobooks that are non copyrighted and available  in public domain."
    authors = listOf("YF")

    /**
     * Status int as the following:
     * 0: Down
     * 1: Ok
     * 2: Slow
     * 3: Beta only
     * */
    status = 1 // will be 3 if unspecified
    tvTypes = listOf(
        "Others"
    )

    iconUrl = ""
}