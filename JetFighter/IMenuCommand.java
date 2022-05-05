/**
 * Write a description of class IMenuCommand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface IMenuCommand
{
    /** Execute the Command */
    void execute() ;

    /** 
     * Configure the Receiver for the Command
     * @param target Receiver
     */
    void setReceiver( IMenuReceiver target ) ;
}
