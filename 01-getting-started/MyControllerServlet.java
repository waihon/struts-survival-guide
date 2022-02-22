public class MyControllerServlet extends HttpServlet {
    private Properties props;
    
    public init(ServletConfig config) throws ServletException {
        try {
            props = new Properties();
            props.load(new FileInputStream("C:/file.properties"));
        } catch (IOException ioe) {
            throw new ServletException(ioe);
        }
    }
    
    public void doGet(HttpServletRequest httpRequest,
                      HttpServletResponse httpResonse)
                      throws ServletException, IOException {
        String urlPath = httpRequest.getPathInfo();
        String reqHandlerClassName = (String)props.get(urlPath);
        
        HandlerInterface handlerInterface = (HandlerInterface)
            Class.forName(reqHandlerClassName).newInstance();
        String nextView = handlerInterface.execute(httpRequest);
        // ...
        RequestDispatcher rd = getServletContext().getRequestDispatcher(nextView);
        rd.forward(httpRequest, httpResonse);
    }
}
