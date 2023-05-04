package music;
import java.util.Comparator;

/**
 * A class for comparing album objects in terms of their artist.
 */
public class ArtistComparator implements Comparator<Album>
{
    @Override
    public int compare(Album a, Album b)
    {
        return ( a.getArtist().compareTo(b.getArtist()) );
    }
}
