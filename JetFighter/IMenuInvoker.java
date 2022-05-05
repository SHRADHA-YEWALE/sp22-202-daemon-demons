/**
 * Write a description of class IMenuInvoker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface IMenuInvoker
{
    /**
     * Set Command for Invoker
     * @param c Command Object
     */
    void setCommand( IMenuCommand c ) ;

    /** Invoke Menu Function */
    void invoke() ;
}

