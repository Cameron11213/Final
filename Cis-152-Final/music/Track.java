package music;

public class Track implements Comparable
{
    private String track;

    /**
     * A track object has a name. 
     * We can add other parameters later like rating and length if necessary.
     */
    public Track(String title)
    {
        track = title;
    }
    
    public String getName()
    {
        return track;
    }
    
    /**
     * Compares two tracks the same way we'd compare two strings.
     * @param otherTrack the track to be compared.
     * @return (see String method API).
     */
    @Override
    public int compareTo(Object o)
    {
        Track otherTrack = (Track) o;
        return track.compareTo(otherTrack.track);
    }
}
