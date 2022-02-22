public class MyServlet extends HttpServlet {
    public void doGet(HttpServletRequest httpRequest,
                      HttpServletResponse httpResponse)
                      throws ServletException, IOException {
    // Extract data from HTTP Request Parameters
    // Business Logic goes here
    // Now write output HTML
    OutputStream os = httpResponse.getOutputStream();
    os.print("<html><body>");
    // Write formatted data to output stream
    os.println("</body></html>");
    os.flush();
    os.close();
}
