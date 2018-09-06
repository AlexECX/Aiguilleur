import java.rmi.*;
import java.net.*;

public class  Server
{
  public static void main(String args[])
  {
  try
  {
  ServerImplements stub=new ServerImplements();
  Naming.rebind("rmi://localhost:5000/service",stub);
  System.out.println("Server Started ");
  }
  catch(Exception e)
  {
  System.out.println(e.getMessage());
  }
  }

}