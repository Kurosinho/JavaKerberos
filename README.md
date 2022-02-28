# JavaKerberos
An attempt at creating a KDC supported acces to a web service.

This project uses a combination of 2 Kerberos dependencies. Kerby for the KDC, and Kerberos for Spring - SPNEGO. SPNEGO handles negotiation on the client side, while Kerby is running inside a dockerized KDC. 

TODO: Add more prinicpals and enable testing.
