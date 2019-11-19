import http.client
import json

data = json.dumps({ 'nonce': "NONCE", 'payload' : "PAYLOAD" })
headers = {'Content-type': 'application/json', 'Accept': 'application/json' }
connection = http.client.HTTPConnection("104.211.48.168:8080")
#connection = http.client.HTTPConnection("10.5.0.4:8080")
#connection.request("GET", "/signature", data, headers)
connection.request("GET", "/signature")
response = connection.getresponse()
#print("Status: ", response)
#print("Status: {} and reason: {}".format(response.status, response.reason))
x=response.read().decode()
j= json.loads(x);
print(j)
#print("type ", type(j))
connection.close()
