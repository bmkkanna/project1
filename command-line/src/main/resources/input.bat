@echo off

echo hello
cd C:\Users\u734049\Desktop\zatca-einvoicing-sdk-Java-238-R3.3.9\Apps
fatoora -sign -invoice C:\Users\u734049\Desktop\bmk_Invoice_inp.xml -signedInvoice C:\Users\u734049\Desktop\bmk_Invoice_out3.xml &&^
fatoora -generateHash -invoice C:\Users\u734049\Desktop\bmk_Invoice_out3.xml &&^
fatoora -qr -invoice C:\Users\u734049\Desktop\bmk_Invoice_out3.xml &&^