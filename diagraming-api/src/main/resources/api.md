#  api

详见 [open api](http://open.processon.com/wiki#new)



## msgStr

> 请求地址

/diagraming/msg

> 请求参数

~~~json
{
"msgStr": [{"action":"command","messages":[{"action":"create","content":[{"id":"166287894a794e","name":"rectangle","title":"Rectangle","category":"basic","group":"","groupName":null,"locked":false,"link":"","children":[],"parent":"","resizeDir":["tl","tr","br","bl"],"attribute":{"container":false,"visible":true,"rotatable":true,"linkable":true,"collapsable":false,"collapsed":false,"markerOffset":5},"dataAttributes":[{"name":"no.","type":"number","value":"","category":"default","id":"166287894a7cd6"},{"name":"name","type":"string","value":"","category":"default","id":"166287894a7589"},{"name":"owner","type":"string","value":"","category":"default","id":"166287894a7a97"},{"name":"link","type":"link","value":"","category":"default","id":"166287894a7716"},{"name":"memo","type":"string","value":"","category":"default","id":"166287894a7356"}],"props":{"x":391,"y":168,"w":100,"h":70,"zindex":2,"angle":0},"shapeStyle":{"alpha":1},"lineStyle":{},"fillStyle":{},"path":[{"actions":[{"action":"move","x":"0","y":"0"},{"action":"line","x":"w","y":"0"},{"action":"line","x":"w","y":"h"},{"action":"line","x":"0","y":"h"},{"action":"close"}]}],"fontStyle":{},"textBlock":[{"position":{"x":10,"y":0,"w":"w-20","h":"h"},"text":""}],"anchors":[{"x":"w/2","y":"0"},{"x":"w/2","y":"h"},{"x":"0","y":"h/2"},{"x":"w","y":"h/2"}]}]}],"name":"先生"}]
"ignore": msgStr,
"chartId": 5bb02f62e4b08faf8c6b5f3c,
"uk": 5bb02e68e4b075b9fe5e0a54,
"client": 1538273124691
}

~~~
 
 > 返回结果
 
 ~~~json
 
 {"version":18}
 ~~~


## add_version


> 请求地址

/diagraming/add_version

> 请求参数


~~~json
{
chartId: 5bb02f62e4b08faf8c6b5f3c
userId: 5bb02e68e4b075b9fe5e0a54
fullName: 先生
def: {"page":{"backgroundColor":"transparent","width":1050,"height":1000,"padding":20,"showGrid":true,"gridSize":15,"orientation":"portrait"},"elements":{"1662878075c0a4":{"id":"1662878075c0a4","name":"round","title":"Round","category":"basic","group":"","groupName":null,"locked":false,"link":"","children":[],"parent":"","resizeDir":["tl","tr","br","bl"],"attribute":{"container":false,"visible":true,"rotatable":true,"linkable":true,"collapsable":false,"collapsed":false,"markerOffset":5},"dataAttributes":[{"name":"no.","type":"number","value":"","category":"default","id":"1662878075de61"},{"name":"name","type":"string","value":"","category":"default","id":"1662878075d33b"},{"name":"owner","type":"string","value":"","category":"default","id":"1662878075d6bd"},{"name":"link","type":"link","value":"","category":"default","id":"1662878075d561"},{"name":"memo","type":"string","value":"","category":"default","id":"1662878075da35"}],"props":{"x":277,"y":241,"w":70,"h":70,"zindex":1,"angle":0},"shapeStyle":{"alpha":1},"lineStyle":{},"fillStyle":{},"path":[{"actions":[{"action":"move","x":"0","y":"h/2"},{"action":"curve","x1":"0","y1":"-h/6","x2":"w","y2":"-h/6","x":"w","y":"h/2"},{"action":"curve","x1":"w","y1":"h+h/6","x2":"0","y2":"h+h/6","x":"0","y":"h/2"},{"action":"close"}]}],"fontStyle":{},"textBlock":[{"position":{"x":10,"y":0,"w":"w-20","h":"h"},"text":""}],"anchors":[{"x":"w/2","y":"0"},{"x":"w/2","y":"h"},{"x":"0","y":"h/2"},{"x":"w","y":"h/2"}]},"166287894a794e":{"id":"166287894a794e","name":"rectangle","title":"Rectangle","category":"basic","group":"","groupName":null,"locked":false,"link":"","children":[],"parent":"","resizeDir":["tl","tr","br","bl"],"attribute":{"container":false,"visible":true,"rotatable":true,"linkable":true,"collapsable":false,"collapsed":false,"markerOffset":5},"dataAttributes":[{"name":"no.","type":"number","value":"","category":"default","id":"166287894a7cd6"},{"name":"name","type":"string","value":"","category":"default","id":"166287894a7589"},{"name":"owner","type":"string","value":"","category":"default","id":"166287894a7a97"},{"name":"link","type":"link","value":"","category":"default","id":"166287894a7716"},{"name":"memo","type":"string","value":"","category":"default","id":"166287894a7356"}],"props":{"x":391,"y":168,"w":100,"h":70,"zindex":2,"angle":0},"shapeStyle":{"alpha":1},"lineStyle":{},"fillStyle":{},"path":[{"actions":[{"action":"move","x":"0","y":"0"},{"action":"line","x":"w","y":"0"},{"action":"line","x":"w","y":"h"},{"action":"line","x":"0","y":"h"},{"action":"close"}]}],"fontStyle":{},"textBlock":[{"position":{"x":10,"y":0,"w":"w-20","h":"h"},"text":""}],"anchors":[{"x":"w/2","y":"0"},{"x":"w/2","y":"h"},{"x":"0","y":"h/2"},{"x":"w","y":"h/2"}]}}}
remark: 自动存储
ignore: def
}

~~~
 
 > 返回结果
 
 ~~~json
{"result":"success"}
 ~~~
 
 ## get_versions
 
 > 请求地址
 
 diagraming/get_versions?chartId=5bb02f62e4b08faf8c6b5f3c
 
 > 请求参数
 
chartId=5bb02f62e4b08faf8c6b5f3c

 > 返回结果
 
 ~~~json
 
{"list":[{"chartId":"5bb02f62e4b08faf8c6b5f3c","_id":{"$oid":"5bb07943e4b06fc64b0c0bfc"},"remark":"自动存储","userId":"5bb02e68e4b075b9fe5e0a54","fullName":"先生","createDate":"2018-09-30 15:20:35","definitionId":"5bb07943e4b06fc64b0c0bfb"},{"chartId":"5bb02f62e4b08faf8c6b5f3c","_id":{"$oid":"5bb073fde4b0d4d65c1daaf4"},"remark":"自动存储","userId":"5bb02e68e4b075b9fe5e0a54","fullName":"先生","createDate":"2018-09-30 14:58:05","definitionId":"5bb073fde4b0d4d65c1daaf3"},{"chartId":"5bb02f62e4b08faf8c6b5f3c","_id":{"$oid":"5bb07365e4b0fe81b64d9528"},"remark":"23423","userId":"5bb02e68e4b075b9fe5e0a54","fullName":"先生","createDate":"2018-09-30 14:55:33","definitionId":"5bb07365e4b0fe81b64d9527"},{"chartId":"5bb02f62e4b08faf8c6b5f3c","_id":{"$oid":"5bb06b25e4b0fe81b64d8173"},"remark":"自动存储","userId":"5bb02e68e4b075b9fe5e0a54","fullName":"先生","createDate":"2018-09-30 14:20:21","definitionId":"5bb06b25e4b0fe81b64d8172"},{"chartId":"5bb02f62e4b08faf8c6b5f3c","_id":{"$oid":"5bb0418ee4b015327af73395"},"remark":"自动存储","userId":"5bb02e68e4b075b9fe5e0a54","fullName":"先生","createDate":"2018-09-30 11:22:54","definitionId":"5bb0418ee4b015327af73394"},{"chartId":"5bb02f62e4b08faf8c6b5f3c","_id":{"$oid":"5bb03faee4b08faf8c6b8c58"},"remark":"自动存储","userId":"5bb02e68e4b075b9fe5e0a54","fullName":"先生","createDate":"2018-09-30 11:14:54","definitionId":"5bb03faee4b08faf8c6b8c57"},{"chartId":"5bb02f62e4b08faf8c6b5f3c","_id":{"$oid":"5bb02fdbe4b015327af70105"},"remark":"自动存储","userId":"5bb02e68e4b075b9fe5e0a54","fullName":"先生","createDate":"2018-09-30 10:07:23","definitionId":"5bb02fdbe4b015327af70104"}]}

 ~~~
 
 
 ## getdef
  
  > 请求地址
  
  diagraming/getdef?id=5bb07dbae4b0bd4db953bac0
  
  > 请求参数
  
 chartId=5bb02f62e4b08faf8c6b5f3c
 
  > 返回结果
  
~~~json
  
{"def":"{\"page\":{\"gridSize\":15,\"showGrid\":true,\"orientation\":\"portrait\",\"height\":1000,\"backgroundColor\":\"transparent\",\"width\":1050,\"padding\":20},\"theme\":{\"linker\":{\"lineStyle\":{\"lineColor\":\"50,50,50\",\"lineWidth\":2},\"fontStyle\":{\"bold\":false,\"color\":\"50,50,50\",\"fontFamily\":\"微软雅黑\",\"italic\":false,\"size\":13}},\"name\":\"normal_yahei\",\"shape\":{\"lineStyle\":{\"lineColor\":\"50,50,50\",\"lineWidth\":2},\"fillStyle\":{\"color\":\"255,255,255\",\"type\":\"solid\"},\"fontStyle\":{\"bold\":false,\"color\":\"50,50,50\",\"fontFamily\":\"微软雅黑\",\"italic\":false,\"size\":13}}},\"elements\":{\"166287f32e74fc\":{\"textBlock\":[{\"position\":{\"w\":\"w\",\"y\":\"h*0.33\",\"h\":\"h*0.34\",\"x\":\"0\"},\"text\":\"\"}],\"lineStyle\":{},\"link\":\"\",\"children\":[],\"parent\":\"\",\"attribute\":{\"linkable\":true,\"visible\":true,\"container\":false,\"rotatable\":true,\"markerOffset\":5,\"collapsable\":false,\"collapsed\":false},\"fontStyle\":{},\"resizeDir\":[\"tl\",\"tr\",\"br\",\"bl\"],\"dataAttributes\":[{\"id\":\"166287f32e7ee1\",\"category\":\"default\",\"name\":\"no.\",\"value\":\"\",\"type\":\"number\"},{\"id\":\"166287f32e72c\",\"category\":\"default\",\"name\":\"name\",\"value\":\"\",\"type\":\"string\"},{\"id\":\"166287f32e77e3\",\"category\":\"default\",\"name\":\"owner\",\"value\":\"\",\"type\":\"string\"},{\"id\":\"166287f32e791b\",\"category\":\"default\",\"name\":\"link\",\"value\":\"\",\"type\":\"link\"},{\"id\":\"166287f32e770c\",\"category\":\"default\",\"name\":\"memo\",\"value\":\"\",\"type\":\"string\"}],\"shapeStyle\":{\"alpha\":1},\"id\":\"166287f32e74fc\",\"anchors\":[{\"y\":\"h*0.5\",\"x\":\"w\"},{\"y\":\"h*0.5\",\"x\":\"0\"}],\"category\":\"basic\",\"title\":\"Single Left Arrow\",\"name\":\"singleLeftArrow\",\"fillStyle\":{},\"path\":[{\"actions\":[{\"action\":\"move\",\"y\":\"h/2\",\"x\":\"0\"},{\"action\":\"line\",\"y\":\"0\",\"x\":\"Math.min(0.5*h,0.45*w)\"},{\"action\":\"line\",\"y\":\"h*0.33\",\"x\":\"Math.min(0.5*h,0.45*w)\"},{\"action\":\"line\",\"y\":\"h*0.33\",\"x\":\"w\"},{\"action\":\"line\",\"y\":\"h*0.67\",\"x\":\"w\"},{\"action\":\"line\",\"y\":\"h*0.67\",\"x\":\"Math.min(0.5*h,0.45*w)\"},{\"action\":\"line\",\"y\":\"h\",\"x\":\"Math.min(0.5*h,0.45*w)\"},{\"action\":\"line\",\"y\":\"h/2\",\"x\":\"0\"},{\"action\":\"close\"}]}],\"locked\":false,\"group\":\"\",\"props\":{\"w\":90,\"y\":405,\"h\":60,\"angle\":0,\"x\":551,\"zindex\":4}},\"166287f2c2159a\":{\"textBlock\":[{\"position\":{\"w\":\"w-20\",\"y\":\"10\",\"h\":\"h-20\",\"x\":\"10\"},\"text\":\"\"}],\"lineStyle\":{},\"link\":\"\",\"children\":[],\"parent\":\"\",\"attribute\":{\"linkable\":true,\"visible\":true,\"container\":false,\"rotatable\":true,\"markerOffset\":5,\"collapsable\":false,\"collapsed\":false},\"fontStyle\":{},\"resizeDir\":[\"tl\",\"tr\",\"br\",\"bl\"],\"dataAttributes\":[{\"id\":\"166287f2c21e2b\",\"category\":\"default\",\"name\":\"no.\",\"value\":\"\",\"type\":\"number\"},{\"id\":\"166287f2c214d7\",\"category\":\"default\",\"name\":\"name\",\"value\":\"\",\"type\":\"string\"},{\"id\":\"166287f2c21551\",\"category\":\"default\",\"name\":\"owner\",\"value\":\"\",\"type\":\"string\"},{\"id\":\"166287f2c21ff6\",\"category\":\"default\",\"name\":\"link\",\"value\":\"\",\"type\":\"link\"},{\"id\":\"166287f2c21f34\",\"category\":\"default\",\"name\":\"memo\",\"value\":\"\",\"type\":\"string\"}],\"shapeStyle\":{\"alpha\":1},\"id\":\"166287f2c2159a\",\"anchors\":[{\"y\":\"0\",\"x\":\"w/2\"},{\"y\":\"h\",\"x\":\"w/2\"},{\"y\":\"h/2\",\"x\":\"0\"},{\"y\":\"h/2\",\"x\":\"w\"}],\"category\":\"basic\",\"title\":\"Octagon\",\"name\":\"octagon\",\"fillStyle\":{},\"path\":[{\"actions\":[{\"action\":\"move\",\"y\":\"0\",\"x\":\"Math.min(w,h)*0.29\"},{\"action\":\"line\",\"y\":\"0\",\"x\":\"w-Math.min(w,h)*0.29\"},{\"action\":\"line\",\"y\":\"h*0.29\",\"x\":\"w\"},{\"action\":\"line\",\"y\":\"h*0.71\",\"x\":\"w\"},{\"action\":\"line\",\"y\":\"h\",\"x\":\"w-Math.min(w,h)*0.29\"},{\"action\":\"line\",\"y\":\"h\",\"x\":\"Math.min(w,h)*0.29\"},{\"action\":\"line\",\"y\":\"h*0.71\",\"x\":\"0\"},{\"action\":\"line\",\"y\":\"h*0.29\",\"x\":\"0\"},{\"action\":\"close\"}]}],\"locked\":false,\"group\":\"\",\"props\":{\"w\":70,\"y\":363,\"h\":70,\"angle\":0,\"x\":325,\"zindex\":3}},\"166287894a794e\":{\"textBlock\":[{\"position\":{\"w\":\"w-20\",\"y\":0,\"h\":\"h\",\"x\":10},\"text\":\"\"}],\"lineStyle\":{},\"link\":\"\",\"children\":[],\"parent\":\"\",\"attribute\":{\"linkable\":true,\"visible\":true,\"container\":false,\"rotatable\":true,\"markerOffset\":5,\"collapsable\":false,\"collapsed\":false},\"fontStyle\":{},\"resizeDir\":[\"tl\",\"tr\",\"br\",\"bl\"],\"dataAttributes\":[{\"id\":\"166287894a7cd6\",\"category\":\"default\",\"name\":\"no.\",\"value\":\"\",\"type\":\"number\"},{\"id\":\"166287894a7589\",\"category\":\"default\",\"name\":\"name\",\"value\":\"\",\"type\":\"string\"},{\"id\":\"166287894a7a97\",\"category\":\"default\",\"name\":\"owner\",\"value\":\"\",\"type\":\"string\"},{\"id\":\"166287894a7716\",\"category\":\"default\",\"name\":\"link\",\"value\":\"\",\"type\":\"link\"},{\"id\":\"166287894a7356\",\"category\":\"default\",\"name\":\"memo\",\"value\":\"\",\"type\":\"string\"}],\"shapeStyle\":{\"alpha\":1},\"id\":\"166287894a794e\",\"anchors\":[{\"y\":\"0\",\"x\":\"w/2\"},{\"y\":\"h\",\"x\":\"w/2\"},{\"y\":\"h/2\",\"x\":\"0\"},{\"y\":\"h/2\",\"x\":\"w\"}],\"category\":\"basic\",\"title\":\"Rectangle\",\"name\":\"rectangle\",\"fillStyle\":{},\"path\":[{\"actions\":[{\"action\":\"move\",\"y\":\"0\",\"x\":\"0\"},{\"action\":\"line\",\"y\":\"0\",\"x\":\"w\"},{\"action\":\"line\",\"y\":\"h\",\"x\":\"w\"},{\"action\":\"line\",\"y\":\"h\",\"x\":\"0\"},{\"action\":\"close\"}]}],\"locked\":false,\"group\":\"\",\"props\":{\"w\":100,\"y\":168,\"h\":70,\"angle\":0,\"x\":391,\"zindex\":2}},\"16629221a5db5c\":{\"textBlock\":[{\"position\":{\"w\":\"w\",\"h\":\"h*0.34\",\"y\":\"h*0.33\",\"x\":\"0\"},\"text\":\"\"}],\"lineStyle\":{},\"link\":\"\",\"children\":[],\"parent\":\"\",\"attribute\":{\"linkable\":true,\"visible\":true,\"container\":false,\"rotatable\":true,\"markerOffset\":5,\"collapsable\":false,\"collapsed\":false},\"fontStyle\":{},\"resizeDir\":[\"tl\",\"tr\",\"br\",\"bl\"],\"dataAttributes\":[{\"id\":\"16629221a5dd8b\",\"category\":\"default\",\"name\":\"no.\",\"value\":\"\",\"type\":\"number\"},{\"id\":\"16629221a5d252\",\"category\":\"default\",\"name\":\"name\",\"value\":\"\",\"type\":\"string\"},{\"id\":\"16629221a5d8f3\",\"category\":\"default\",\"name\":\"owner\",\"value\":\"\",\"type\":\"string\"},{\"id\":\"16629221a5d755\",\"category\":\"default\",\"name\":\"link\",\"value\":\"\",\"type\":\"link\"},{\"id\":\"16629221a5da3d\",\"category\":\"default\",\"name\":\"memo\",\"value\":\"\",\"type\":\"string\"}],\"shapeStyle\":{\"alpha\":1},\"id\":\"16629221a5db5c\",\"anchors\":[{\"y\":\"h*0.5\",\"x\":\"w\"},{\"y\":\"h*0.5\",\"x\":\"0\"}],\"title\":\"Single Right Arrow\",\"category\":\"basic\",\"name\":\"singleRightArrow\",\"path\":[{\"actions\":[{\"action\":\"move\",\"y\":\"h*0.33\",\"x\":\"0\"},{\"action\":\"line\",\"y\":\"h*0.33\",\"x\":\"w-Math.min(h*0.5,w*0.45)\"},{\"action\":\"line\",\"y\":\"0\",\"x\":\"w-Math.min(h*0.5,w*0.45)\"},{\"action\":\"line\",\"y\":\"h*0.5\",\"x\":\"w\"},{\"action\":\"line\",\"y\":\"h\",\"x\":\"w-Math.min(h*0.5,w*0.45)\"},{\"action\":\"line\",\"y\":\"h*0.67\",\"x\":\"w-Math.min(h*0.5,w*0.45)\"},{\"action\":\"line\",\"y\":\"h*0.67\",\"x\":\"0\"},{\"action\":\"line\",\"y\":\"h*0.33\",\"x\":\"0\"},{\"action\":\"close\"}]}],\"fillStyle\":{},\"locked\":false,\"group\":\"\",\"props\":{\"w\":90,\"angle\":0,\"h\":60,\"y\":257,\"zindex\":6,\"x\":346}},\"16629199bfa0a3\":{\"textBlock\":[{\"position\":{\"w\":\"w-20\",\"y\":0,\"h\":\"h\",\"x\":10},\"text\":\"\"}],\"lineStyle\":{},\"link\":\"\",\"children\":[],\"parent\":\"\",\"attribute\":{\"linkable\":true,\"visible\":true,\"container\":false,\"rotatable\":true,\"markerOffset\":5,\"collapsable\":false,\"collapsed\":false},\"fontStyle\":{},\"resizeDir\":[\"tl\",\"tr\",\"br\",\"bl\"],\"dataAttributes\":[{\"id\":\"16629199bfaf98\",\"category\":\"default\",\"name\":\"no.\",\"value\":\"\",\"type\":\"number\"},{\"id\":\"16629199bfa89d\",\"category\":\"default\",\"name\":\"name\",\"value\":\"\",\"type\":\"string\"},{\"id\":\"16629199bfab7b\",\"category\":\"default\",\"name\":\"owner\",\"value\":\"\",\"type\":\"string\"},{\"id\":\"16629199bfa06c\",\"category\":\"default\",\"name\":\"link\",\"value\":\"\",\"type\":\"link\"},{\"id\":\"16629199bfaee8\",\"category\":\"default\",\"name\":\"memo\",\"value\":\"\",\"type\":\"string\"}],\"shapeStyle\":{\"alpha\":1},\"id\":\"16629199bfa0a3\",\"anchors\":[{\"y\":\"0.134*h\",\"x\":\"0\"},{\"y\":\"0\",\"x\":\"w/2\"},{\"y\":\"0.134*h\",\"x\":\"w\"},{\"y\":\"h\",\"x\":\"w/2\"}],\"category\":\"basic\",\"title\":\"\",\"name\":\"sector\",\"fillStyle\":{},\"path\":[{\"actions\":[{\"action\":\"move\",\"y\":\"h\",\"x\":\"w/2\"},{\"action\":\"line\",\"y\":\"0.134*h\",\"x\":\"0\"},{\"action\":\"quadraticCurve\",\"y1\":\"-0.134*h\",\"y\":\"h*0.134\",\"x1\":\"w/2\",\"x\":\"w\"},{\"action\":\"close\"}]}],\"locked\":false,\"group\":\"\",\"props\":{\"w\":80,\"y\":126,\"h\":80,\"angle\":0,\"x\":351,\"zindex\":2}},\"1662878075c0a4\":{\"textBlock\":[{\"position\":{\"w\":\"w-20\",\"y\":0,\"h\":\"h\",\"x\":10},\"text\":\"\"}],\"lineStyle\":{},\"link\":\"\",\"children\":[],\"parent\":\"\",\"attribute\":{\"linkable\":true,\"visible\":true,\"container\":false,\"rotatable\":true,\"markerOffset\":5,\"collapsable\":false,\"collapsed\":false},\"fontStyle\":{},\"resizeDir\":[\"tl\",\"tr\",\"br\",\"bl\"],\"dataAttributes\":[{\"id\":\"1662878075de61\",\"category\":\"default\",\"name\":\"no.\",\"value\":\"\",\"type\":\"number\"},{\"id\":\"1662878075d33b\",\"category\":\"default\",\"name\":\"name\",\"value\":\"\",\"type\":\"string\"},{\"id\":\"1662878075d6bd\",\"category\":\"default\",\"name\":\"owner\",\"value\":\"\",\"type\":\"string\"},{\"id\":\"1662878075d561\",\"category\":\"default\",\"name\":\"link\",\"value\":\"\",\"type\":\"link\"},{\"id\":\"1662878075da35\",\"category\":\"default\",\"name\":\"memo\",\"value\":\"\",\"type\":\"string\"}],\"shapeStyle\":{\"alpha\":1},\"id\":\"1662878075c0a4\",\"anchors\":[{\"y\":\"0\",\"x\":\"w/2\"},{\"y\":\"h\",\"x\":\"w/2\"},{\"y\":\"h/2\",\"x\":\"0\"},{\"y\":\"h/2\",\"x\":\"w\"}],\"category\":\"basic\",\"title\":\"Round\",\"name\":\"round\",\"fillStyle\":{},\"path\":[{\"actions\":[{\"action\":\"move\",\"y\":\"h/2\",\"x\":\"0\"},{\"action\":\"curve\",\"y1\":\"-h/6\",\"y2\":\"-h/6\",\"x2\":\"w\",\"y\":\"h/2\",\"x1\":\"0\",\"x\":\"w\"},{\"action\":\"curve\",\"y1\":\"h+h/6\",\"y2\":\"h+h/6\",\"x2\":\"0\",\"y\":\"h/2\",\"x1\":\"w\",\"x\":\"0\"},{\"action\":\"close\"}]}],\"locked\":false,\"group\":\"\",\"props\":{\"w\":70,\"y\":241,\"h\":70,\"angle\":0,\"x\":277,\"zindex\":1}}}}"}
 
~~~
 
 