package metanit.chap4.c9_interface

open class Video {
    open fun play() { println("Play video") }
}

interface AudioPlayable {
    fun play() { println("Play audio") }
}

class MediaPlayer() : Video(), AudioPlayable {
    override fun play() {
        super<Video>.play()
        super<AudioPlayable>.play()
    }
}