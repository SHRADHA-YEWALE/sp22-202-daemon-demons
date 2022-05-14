/**
 * Menu Invoker Interface for the Command pattern
 * 
 * @author (Puneet Tokhi)
 * @version (a version number or a date)
 */
public interface IMenuInvoker
{
    /**
     * Set Command for Invoker
     * @param c IMenuCommand Object
     */
    void setCommand( IMenuCommand c ) ;

    /** Invoke Menu Function */
    void invoke() ;
}

