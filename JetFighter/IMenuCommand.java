/**
 * Menu Command Interface for the Command pattern
 * 
 * @author (Puneet Tokhi)
 * @version (a version number or a date)
 */
public interface IMenuCommand
{
    /** Execute the Command */
    void execute() ;

    /** 
     * Configure the Receiver for the Command
     * @param target IMenuReceiver object
     */
    void setReceiver( IMenuReceiver target ) ;
}
