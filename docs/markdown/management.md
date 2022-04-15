# ucloudfilm management API


<a name="overview"></a>
## 概览
ucloudfilm management Api Documentation


### 版本信息
*版本* : 2.0.0


### URI scheme
*域名* : 127.0.0.1:8882  
*基础路径* : /management


### 标签

* ChargeExportRecord : Charge Export Record Controller
* StudyOperationLog : Study Operation Log Controller
* bill-statistics-controller : Bill Statistics Controller
* config-charge-item-controller : Config Charge Item Controller
* config-charge-template-controller : Config Charge Template Controller
* file-export-controller : File Export Controller
* home-controller : Home Controller
* query-controller : Query Controller
* storage-space-controller : Storage Space Controller




<a name="paths"></a>
## 资源

<a name="chargeexportrecord_resource"></a>
### ChargeExportRecord
Charge Export Record Controller


<a name="querylistusingget"></a>
#### 查询导出记录
```
GET /management/v1/charge-export-records/query-list
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**asc**  <br>*可选*||string|
|**Query**|**commandType**  <br>*可选*|请求类型(仅查询清单需要)Charge,Refund,NotBill,All|string|
|**Query**|**desc**  <br>*可选*||string|
|**Query**|**from**  <br>*可选*|起始时间(时间戳)|string|
|**Query**|**locationCode**  <br>*可选*|机构代码|string|
|**Query**|**locationRefid**  <br>*可选*|机构代码Refid|string|
|**Query**|**pageNum**  <br>*可选*||integer (int32)|
|**Query**|**pageSize**  <br>*可选*||integer (int32)|
|**Query**|**timeType**  <br>*可选*|时间维度,StudyTimeStr/AuditDatetime|string|
|**Query**|**to**  <br>*可选*|截止时间(时间戳)|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `application/json;charset=UTF-8`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


##### HTTP请求示例

###### 请求 path
```
/management/v1/charge-export-records/query-list
```


##### HTTP响应示例

###### 响应 200
```json
{
  "code" : "string",
  "data" : "object",
  "msgCode" : "string"
}
```


<a name="studyoperationlog_resource"></a>
### StudyOperationLog
Study Operation Log Controller


<a name="filmviewusingpost"></a>
#### 记录患者浏览记录，修改运营记录
```
POST /management/v1/study-operation-logs/film-view-log
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**accessionNo**  <br>*必填*|检查号|string|
|**Query**|**locationCode**  <br>*必填*|机构代码|string|
|**Query**|**operationType**  <br>*可选*|操作类型（开启云胶片：0、关闭云胶片：1、删除数据：2、恢复数据：3、查看数据：4)|string|
|**Query**|**procedureOffice**  <br>*必填*|科室代码|string|
|**Query**|**visitIp**  <br>*可选*||string|
|**Query**|**visitLength**  <br>*可选*|访问时长|string|
|**Query**|**visitMode**  <br>*可选*|访问方式（登录:0、查询：1、二维码：2）|string|
|**Query**|**visitType**  <br>*可选*|访问类型(公众号:0、APP：1、小程序：2、PC端：3)|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `application/json;charset=UTF-8`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


##### HTTP请求示例

###### 请求 path
```
/management/v1/study-operation-logs/film-view-log?accessionNo=string&locationCode=string&procedureOffice=string
```


##### HTTP响应示例

###### 响应 200
```json
{
  "code" : "string",
  "data" : "object",
  "msgCode" : "string"
}
```


<a name="querylistusingget_1"></a>
#### 查询
```
GET /management/v1/study-operation-logs/query-list
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**accessionNo**  <br>*可选*|检查号|string|
|**Query**|**asc**  <br>*可选*||string|
|**Query**|**desc**  <br>*可选*||string|
|**Query**|**locationCode**  <br>*可选*|机构编码|string|
|**Query**|**pageNum**  <br>*可选*||integer (int32)|
|**Query**|**pageSize**  <br>*可选*||integer (int32)|
|**Query**|**procedureOffice**  <br>*可选*|检查科室|string|
|**Query**|**queryType**  <br>*可选*|查询记录类型(0: 操作记录， 1: 访问记录)|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `application/json;charset=UTF-8`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


##### HTTP请求示例

###### 请求 path
```
/management/v1/study-operation-logs/query-list
```


##### HTTP响应示例

###### 响应 200
```json
{
  "code" : "string",
  "data" : "object",
  "msgCode" : "string"
}
```


<a name="bill-statistics-controller_resource"></a>
### Bill-statistics-controller
Bill Statistics Controller


<a name="getallstatisticsusingget"></a>
#### 所有统计结果
```
GET /management/v1/statistics
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**commandType**  <br>*可选*|请求类型(仅查询清单需要)Charge,Refund,NotBill,All|string|
|**Query**|**from**  <br>*可选*|起始时间(时间戳)|string|
|**Query**|**locationCode**  <br>*可选*|机构代码|string|
|**Query**|**locationRefid**  <br>*可选*|机构代码Refid|string|
|**Query**|**timeType**  <br>*可选*|时间维度,StudyTimeStr/AuditDatetime|string|
|**Query**|**to**  <br>*可选*|截止时间(时间戳)|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ManagementStatisticsResponse](#managementstatisticsresponse)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


##### HTTP请求示例

###### 请求 path
```
/management/v1/statistics
```


##### HTTP响应示例

###### 响应 200
```json
{
  "billStatisticsResponse" : {
    "accessionCount" : 0,
    "billCount" : 0,
    "chargeCount" : 0,
    "refundCount" : 0
  },
  "filmStatusCountResponse" : {
    "cloudAndPaperFilm" : 0,
    "cloudFilm" : 0,
    "notUseFilm" : 0,
    "paperFilm" : 0,
    "total" : 0
  },
  "modalityTypeCountResponse" : {
    "string" : 0
  },
  "patientTypeCountResponse" : {
    "e" : 0,
    "i" : 0,
    "o" : 0,
    "other" : 0,
    "total" : 0
  },
  "printCountResponse" : {
    "currentPeriod" : 0,
    "otherPeriod" : 0,
    "total" : 0
  },
  "serviceTypeStatisticsResponse" : {
    "close" : 0,
    "open" : 0
  },
  "storageSpaceResponse" : {
    "softDelete" : "string",
    "total" : "string"
  }
}
```


<a name="getbillstatisticsusingget"></a>
#### 运营统计结果
```
GET /management/v1/statistics/bill
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**commandType**  <br>*可选*|请求类型(仅查询清单需要)Charge,Refund,NotBill,All|string|
|**Query**|**from**  <br>*可选*|起始时间(时间戳)|string|
|**Query**|**locationCode**  <br>*可选*|机构代码|string|
|**Query**|**locationRefid**  <br>*可选*|机构代码Refid|string|
|**Query**|**timeType**  <br>*可选*|时间维度,StudyTimeStr/AuditDatetime|string|
|**Query**|**to**  <br>*可选*|截止时间(时间戳)|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BillStatisticsResponse](#billstatisticsresponse)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


##### HTTP请求示例

###### 请求 path
```
/management/v1/statistics/bill
```


##### HTTP响应示例

###### 响应 200
```json
{
  "accessionCount" : 0,
  "billCount" : 0,
  "chargeCount" : 0,
  "refundCount" : 0
}
```


<a name="getfilmstatuscountusingget"></a>
#### 胶片类型统计数量
```
GET /management/v1/statistics/filmStatus
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**commandType**  <br>*可选*|请求类型(仅查询清单需要)Charge,Refund,NotBill,All|string|
|**Query**|**from**  <br>*可选*|起始时间(时间戳)|string|
|**Query**|**locationCode**  <br>*可选*|机构代码|string|
|**Query**|**locationRefid**  <br>*可选*|机构代码Refid|string|
|**Query**|**timeType**  <br>*可选*|时间维度,StudyTimeStr/AuditDatetime|string|
|**Query**|**to**  <br>*可选*|截止时间(时间戳)|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[FilmStatusCountResponse](#filmstatuscountresponse)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


##### HTTP请求示例

###### 请求 path
```
/management/v1/statistics/filmStatus
```


##### HTTP响应示例

###### 响应 200
```json
{
  "cloudAndPaperFilm" : 0,
  "cloudFilm" : 0,
  "notUseFilm" : 0,
  "paperFilm" : 0,
  "total" : 0
}
```


<a name="getmodalitytypecountusingget"></a>
#### 检查类型数量统计
```
GET /management/v1/statistics/modalityType
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**commandType**  <br>*可选*|请求类型(仅查询清单需要)Charge,Refund,NotBill,All|string|
|**Query**|**from**  <br>*可选*|起始时间(时间戳)|string|
|**Query**|**locationCode**  <br>*可选*|机构代码|string|
|**Query**|**locationRefid**  <br>*可选*|机构代码Refid|string|
|**Query**|**timeType**  <br>*可选*|时间维度,StudyTimeStr/AuditDatetime|string|
|**Query**|**to**  <br>*可选*|截止时间(时间戳)|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ModalityTypeCountResponse](#modalitytypecountresponse)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


##### HTTP请求示例

###### 请求 path
```
/management/v1/statistics/modalityType
```


##### HTTP响应示例

###### 响应 200
```json
{
  "modalityTypeMap" : {
    "string" : 0
  }
}
```


<a name="getpatienttypecountusingget"></a>
#### 患者类型数量统计
```
GET /management/v1/statistics/patientType
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**commandType**  <br>*可选*|请求类型(仅查询清单需要)Charge,Refund,NotBill,All|string|
|**Query**|**from**  <br>*可选*|起始时间(时间戳)|string|
|**Query**|**locationCode**  <br>*可选*|机构代码|string|
|**Query**|**locationRefid**  <br>*可选*|机构代码Refid|string|
|**Query**|**timeType**  <br>*可选*|时间维度,StudyTimeStr/AuditDatetime|string|
|**Query**|**to**  <br>*可选*|截止时间(时间戳)|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[PatientTypeCountResponse](#patienttypecountresponse)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


##### HTTP请求示例

###### 请求 path
```
/management/v1/statistics/patientType
```


##### HTTP响应示例

###### 响应 200
```json
{
  "e" : 0,
  "i" : 0,
  "o" : 0,
  "other" : 0,
  "total" : 0
}
```


<a name="getprintcountusingget"></a>
#### 打印数量统计
```
GET /management/v1/statistics/print
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**commandType**  <br>*可选*|请求类型(仅查询清单需要)Charge,Refund,NotBill,All|string|
|**Query**|**from**  <br>*可选*|起始时间(时间戳)|string|
|**Query**|**locationCode**  <br>*可选*|机构代码|string|
|**Query**|**locationRefid**  <br>*可选*|机构代码Refid|string|
|**Query**|**timeType**  <br>*可选*|时间维度,StudyTimeStr/AuditDatetime|string|
|**Query**|**to**  <br>*可选*|截止时间(时间戳)|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[PrintCountResponse](#printcountresponse)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


##### HTTP请求示例

###### 请求 path
```
/management/v1/statistics/print
```


##### HTTP响应示例

###### 响应 200
```json
{
  "currentPeriod" : 0,
  "otherPeriod" : 0,
  "total" : 0
}
```


<a name="getservicetypestatisticsusingget"></a>
#### 服务类型统计
```
GET /management/v1/statistics/serviceType
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**commandType**  <br>*可选*|请求类型(仅查询清单需要)Charge,Refund,NotBill,All|string|
|**Query**|**from**  <br>*可选*|起始时间(时间戳)|string|
|**Query**|**locationCode**  <br>*可选*|机构代码|string|
|**Query**|**locationRefid**  <br>*可选*|机构代码Refid|string|
|**Query**|**timeType**  <br>*可选*|时间维度,StudyTimeStr/AuditDatetime|string|
|**Query**|**to**  <br>*可选*|截止时间(时间戳)|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[BillStatisticsResponse](#billstatisticsresponse)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


##### HTTP请求示例

###### 请求 path
```
/management/v1/statistics/serviceType
```


##### HTTP响应示例

###### 响应 200
```json
{
  "accessionCount" : 0,
  "billCount" : 0,
  "chargeCount" : 0,
  "refundCount" : 0
}
```


<a name="getstoragespaceusingget"></a>
#### 存储空间统计
```
GET /management/v1/statistics/storageSpace
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**locationCode**  <br>*可选*|locationCode|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[StorageSpaceResponse](#storagespaceresponse)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


##### HTTP请求示例

###### 请求 path
```
/management/v1/statistics/storageSpace
```


###### 请求 body
```json
{ }
```


##### HTTP响应示例

###### 响应 200
```json
{
  "softDelete" : "string",
  "total" : "string"
}
```


<a name="config-charge-item-controller_resource"></a>
### Config-charge-item-controller
Config Charge Item Controller


<a name="getbylocationidusingget"></a>
#### 通过医疗机构ID获取机构结算配置
```
GET /management/v1/configCharges/getByLocationId
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**locationId**  <br>*可选*|locationId|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `application/json;charset=UTF-8`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


##### HTTP请求示例

###### 请求 path
```
/management/v1/configCharges/getByLocationId
```


##### HTTP响应示例

###### 响应 200
```json
{
  "code" : "string",
  "data" : "object",
  "msgCode" : "string"
}
```


<a name="listusingget"></a>
#### 查询模板配置项
```
GET /management/v1/configCharges/list
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**request**  <br>*可选*|ConfigChargeItemRequest|[模板配置项](#ad5e6071fdaad122030761f86f35b88a)|
|**Body**|**templateId**  <br>*可选*|templateId|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `application/json;charset=UTF-8`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


##### HTTP请求示例

###### 请求 path
```
/management/v1/configCharges/list
```


###### 请求 body
```json
{ }
```


##### HTTP响应示例

###### 响应 200
```json
{
  "code" : "string",
  "data" : "object",
  "msgCode" : "string"
}
```


<a name="deleteusingdelete"></a>
#### 删除模板配置项
```
DELETE /management/v1/configCharges/{id}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*可选*|configcharge id|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 生成

* `application/json;charset=UTF-8`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


##### HTTP请求示例

###### 请求 path
```
/management/v1/configCharges/0
```


##### HTTP响应示例

###### 响应 200
```json
{
  "code" : "string",
  "data" : "object",
  "msgCode" : "string"
}
```


<a name="config-charge-template-controller_resource"></a>
### Config-charge-template-controller
Config Charge Template Controller


<a name="createusingpost"></a>
#### 创建收费模板
```
POST /management/v1/configTemplates/
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**request**  <br>*可选*|configtemplate|[ConfigTemplateRequest](#configtemplaterequest)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `application/json;charset=UTF-8`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


##### HTTP请求示例

###### 请求 path
```
/management/v1/configTemplates/
```


###### 请求 body
```json
{
  "templateName" : "xxx收费模板"
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "code" : "string",
  "data" : "object",
  "msgCode" : "string"
}
```


<a name="configmanagementusingpost"></a>
#### 运营策略设置(id存在则更新,不存在则新增)
```
POST /management/v1/configTemplates/configManagement
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**configManagementModel**  <br>*可选*|ConfigManagementModel|[配置运营策略model](#e80838225c51052d2c0cf2931f1871f0)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `application/json;charset=UTF-8`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


##### HTTP请求示例

###### 请求 path
```
/management/v1/configTemplates/configManagement
```


###### 请求 body
```json
{
  "chargeTemplateId" : 0,
  "deleteHardLife" : 10,
  "deleteHardLifeUnit" : 2,
  "deleteSoftShow" : false,
  "id" : 0,
  "locationRefid" : "string",
  "softConditionList" : [ ]
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "code" : "string",
  "data" : "object",
  "msgCode" : "string"
}
```


<a name="getbyidusingget"></a>
#### 通过医疗机构ID获取运营策略配置
```
GET /management/v1/configTemplates/getByLocationId
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**locationId**  <br>*可选*|locationId|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `application/json;charset=UTF-8`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


##### HTTP请求示例

###### 请求 path
```
/management/v1/configTemplates/getByLocationId
```


##### HTTP响应示例

###### 响应 200
```json
{
  "code" : "string",
  "data" : "object",
  "msgCode" : "string"
}
```


<a name="getdetailbytemplateidusingget"></a>
#### 通过模板id 获取模板配置项详情
```
GET /management/v1/configTemplates/getDetailByTemplateId
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**templateId**  <br>*可选*|templateId|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `application/json;charset=UTF-8`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


##### HTTP请求示例

###### 请求 path
```
/management/v1/configTemplates/getDetailByTemplateId
```


##### HTTP响应示例

###### 响应 200
```json
{
  "code" : "string",
  "data" : "object",
  "msgCode" : "string"
}
```


<a name="getextraconfigbylocationidusingget"></a>
#### 通过LocationId获取额外配置
```
GET /management/v1/configTemplates/getExtraConfigByLocationId
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**locationId**  <br>*可选*|locationId|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `application/json;charset=UTF-8`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


##### HTTP请求示例

###### 请求 path
```
/management/v1/configTemplates/getExtraConfigByLocationId
```


##### HTTP响应示例

###### 响应 200
```json
{
  "code" : "string",
  "data" : "object",
  "msgCode" : "string"
}
```


<a name="listusingget_1"></a>
#### 获取所有收费模板列表
```
GET /management/v1/configTemplates/list
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `application/json;charset=UTF-8`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


##### HTTP请求示例

###### 请求 path
```
/management/v1/configTemplates/list
```


##### HTTP响应示例

###### 响应 200
```json
{
  "code" : "string",
  "data" : "object",
  "msgCode" : "string"
}
```


<a name="listactivityusingget"></a>
#### 获取有效收费模板列表
```
GET /management/v1/configTemplates/list-active
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `application/json;charset=UTF-8`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


##### HTTP请求示例

###### 请求 path
```
/management/v1/configTemplates/list-active
```


##### HTTP响应示例

###### 响应 200
```json
{
  "code" : "string",
  "data" : "object",
  "msgCode" : "string"
}
```


<a name="saveorupdatetemplateitemusingpost"></a>
#### 保存或者更新模板配置项
```
POST /management/v1/configTemplates/saveOrUpdateTemplateItem
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**request**  <br>*可选*|ConfigChargeRequest|[ConfigChargeRequest](#configchargerequest)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `application/json;charset=UTF-8`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


##### HTTP请求示例

###### 请求 path
```
/management/v1/configTemplates/saveOrUpdateTemplateItem
```


###### 请求 body
```json
{
  "configChargeItemList" : [ {
    "charge" : 10.0,
    "chargeType" : 1,
    "chargeUnit" : 1,
    "examType" : "ALL",
    "filmType" : 0,
    "patientType" : "Other",
    "serviceType" : 1,
    "storeLife" : 10,
    "storeLifeUnit" : 1
  } ],
  "extraConfig" : {
    "refundNum" : "0",
    "immediatelyPrintNum" : "0",
    "serviceTypeNum" : "0",
    "storeLoad" : "0",
    "printNum" : "0",
    "filmTypeNum" : "0",
    "receivableNum" : "0",
    "overPrintNum" : "0",
    "studyTypeNum" : "0",
    "patientTypeNum" : "0",
    "receiptsNum" : "0"
  },
  "templateId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "code" : "string",
  "data" : "object",
  "msgCode" : "string"
}
```


<a name="updateusingput"></a>
#### 更新收费模板名称
```
PUT /management/v1/configTemplates/updateTemplateName
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**request**  <br>*可选*|ConfigTemplateUpdateRequest|[ConfigTemplateUpdateRequest](#configtemplateupdaterequest)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `application/json;charset=UTF-8`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


##### HTTP请求示例

###### 请求 path
```
/management/v1/configTemplates/updateTemplateName
```


###### 请求 body
```json
{
  "id" : 0,
  "templateName" : "xxx收费模板"
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "code" : "string",
  "data" : "object",
  "msgCode" : "string"
}
```


<a name="deleteusingdelete_1"></a>
#### 删除收费模板(标注为无效)
```
DELETE /management/v1/configTemplates/{id}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*可选*|configtemplate id|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 生成

* `application/json;charset=UTF-8`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


##### HTTP请求示例

###### 请求 path
```
/management/v1/configTemplates/0
```


##### HTTP响应示例

###### 响应 200
```json
{
  "code" : "string",
  "data" : "object",
  "msgCode" : "string"
}
```


<a name="file-export-controller_resource"></a>
### File-export-controller
File Export Controller


<a name="getbillusingget"></a>
#### 收费清单导出
```
GET /management/v1/file/bill
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**asc**  <br>*可选*||string|
|**Query**|**commandType**  <br>*可选*|请求类型(仅查询清单需要)Charge,Refund,NotBill,All|string|
|**Query**|**desc**  <br>*可选*||string|
|**Query**|**from**  <br>*可选*|起始时间(时间戳)|string|
|**Query**|**locationCode**  <br>*可选*|机构代码|string|
|**Query**|**locationRefid**  <br>*可选*|机构代码Refid|string|
|**Query**|**pageNum**  <br>*可选*||integer (int32)|
|**Query**|**pageSize**  <br>*可选*||integer (int32)|
|**Query**|**timeType**  <br>*可选*|时间维度,StudyTimeStr/AuditDatetime|string|
|**Query**|**to**  <br>*可选*|截止时间(时间戳)|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


##### HTTP请求示例

###### 请求 path
```
/management/v1/file/bill
```


<a name="getbillandallstatisticsusingget"></a>
#### 收费和收费统计结果清单导出
```
GET /management/v1/file/billAndStatistics
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**asc**  <br>*可选*||string|
|**Query**|**commandType**  <br>*可选*|请求类型(仅查询清单需要)Charge,Refund,NotBill,All|string|
|**Query**|**desc**  <br>*可选*||string|
|**Query**|**from**  <br>*可选*|起始时间(时间戳)|string|
|**Query**|**locationCode**  <br>*可选*|机构代码|string|
|**Query**|**locationRefid**  <br>*可选*|机构代码Refid|string|
|**Query**|**pageNum**  <br>*可选*||integer (int32)|
|**Query**|**pageSize**  <br>*可选*||integer (int32)|
|**Query**|**timeType**  <br>*可选*|时间维度,StudyTimeStr/AuditDatetime|string|
|**Query**|**to**  <br>*可选*|截止时间(时间戳)|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


##### HTTP请求示例

###### 请求 path
```
/management/v1/file/billAndStatistics
```


<a name="excellistdownloadserviceusingpost"></a>
#### 运营清单导出
```
POST /management/v1/file/operation
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**asc**  <br>*可选*||string|
|**Query**|**desc**  <br>*可选*||string|
|**Query**|**pageNum**  <br>*可选*||integer (int32)|
|**Query**|**pageSize**  <br>*可选*||integer (int32)|
|**Body**|**queryConditionVo**  <br>*必填*|queryConditionVo|[QueryConditionVo](#queryconditionvo)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|无内容|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


##### HTTP请求示例

###### 请求 path
```
/management/v1/file/operation
```


###### 请求 body
```json
{
  "accessionNo" : "string",
  "auditDatetime" : {
    "from" : "string",
    "to" : "string"
  },
  "commandType" : "string",
  "deleteReason" : "string",
  "deleteStatus" : "string",
  "filmStatus" : "string",
  "hisId" : "string",
  "insertTime" : {
    "from" : "string",
    "to" : "string"
  },
  "locationCode" : [ "string" ],
  "patientId" : "string",
  "patientName" : "string",
  "paymentStatus" : "string",
  "printTime" : {
    "from" : "string",
    "to" : "string"
  },
  "procedureName" : "string",
  "serviceStatus" : "string",
  "storageExpireTime" : {
    "from" : "string",
    "to" : "string"
  },
  "studyTime" : {
    "from" : "string",
    "to" : "string"
  },
  "viewTime" : {
    "from" : "string",
    "to" : "string"
  }
}
```


<a name="getallstatisticsusingget_1"></a>
#### 收费统计结果导出
```
GET /management/v1/file/statistics
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**commandType**  <br>*可选*|请求类型(仅查询清单需要)Charge,Refund,NotBill,All|string|
|**Query**|**from**  <br>*可选*|起始时间(时间戳)|string|
|**Query**|**locationCode**  <br>*可选*|机构代码|string|
|**Query**|**locationRefid**  <br>*可选*|机构代码Refid|string|
|**Query**|**timeType**  <br>*可选*|时间维度,StudyTimeStr/AuditDatetime|string|
|**Query**|**to**  <br>*可选*|截止时间(时间戳)|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


##### HTTP请求示例

###### 请求 path
```
/management/v1/file/statistics
```


<a name="home-controller_resource"></a>
### Home-controller
Home Controller


<a name="deleteserviceusingdelete"></a>
#### 删除胶片接口
```
DELETE /management/v1/home/delete
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**deleteServiceParamVo**  <br>*必填*|deleteServiceParamVo|[deleteServiceParamVo](#deleteserviceparamvo)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 生成

* `\*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


##### HTTP请求示例

###### 请求 path
```
/management/v1/home/delete
```


###### 请求 body
```json
{
  "userName" : "string",
  "userId" : "string",
  "accessionVoList" : [ {
    "locationCode" : "string",
    "procedureOffice" : "string",
    "accessionNo" : "string",
    "printTime" : "string",
    "printStatus" : "string",
    "filmCount" : 0
  } ]
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "code" : "string",
  "data" : "object",
  "msgCode" : "string"
}
```


<a name="printusingpost"></a>
#### 打印传统胶片
```
POST /management/v1/home/film/print
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**filmServiceParamVo**  <br>*必填*|filmServiceParamVo|[FilmServiceParamVo](#filmserviceparamvo)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


##### HTTP请求示例

###### 请求 path
```
/management/v1/home/film/print
```


###### 请求 body
```json
{
  "commandType" : "string",
  "accessionVoList" : [ {
    "locationCode" : "string",
    "procedureOffice" : "string",
    "accessionNo" : "string",
    "printTime" : "string",
    "printStatus" : "string",
    "filmCount" : 0
  } ]
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "code" : "string",
  "data" : "object",
  "msgCode" : "string"
}
```


<a name="viewusingpost"></a>
#### 访问胶片接口
```
POST /management/v1/home/film/view
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**filmServiceParamVo**  <br>*必填*|filmServiceParamVo|[FilmServiceParamVo](#filmserviceparamvo)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


##### HTTP请求示例

###### 请求 path
```
/management/v1/home/film/view
```


###### 请求 body
```json
{
  "commandType" : "string",
  "accessionVoList" : [ {
    "locationCode" : "string",
    "procedureOffice" : "string",
    "accessionNo" : "string",
    "printTime" : "string",
    "printStatus" : "string",
    "filmCount" : 0
  } ]
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "code" : "string",
  "data" : "object",
  "msgCode" : "string"
}
```


<a name="filmserviceusingpost"></a>
#### 胶片服务通用接口
```
POST /management/v1/home/filmService
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**filmServiceParamVo**  <br>*必填*|filmServiceParamVo|[FilmServiceParamVo](#filmserviceparamvo)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


##### HTTP请求示例

###### 请求 path
```
/management/v1/home/filmService
```


###### 请求 body
```json
{
  "commandType" : "string",
  "accessionVoList" : [ {
    "locationCode" : "string",
    "procedureOffice" : "string",
    "accessionNo" : "string",
    "printTime" : "string",
    "printStatus" : "string",
    "filmCount" : 0
  } ]
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "code" : "string",
  "data" : "object",
  "msgCode" : "string"
}
```


<a name="restoreserviceusingpost"></a>
#### 恢复胶片接口
```
POST /management/v1/home/restore
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**deleteServiceParamVo**  <br>*必填*|deleteServiceParamVo|[deleteServiceParamVo](#deleteserviceparamvo)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


##### HTTP请求示例

###### 请求 path
```
/management/v1/home/restore
```


###### 请求 body
```json
{
  "userName" : "string",
  "userId" : "string",
  "accessionVoList" : [ {
    "locationCode" : "string",
    "procedureOffice" : "string",
    "accessionNo" : "string",
    "printTime" : "string",
    "printStatus" : "string",
    "filmCount" : 0
  } ]
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "code" : "string",
  "data" : "object",
  "msgCode" : "string"
}
```


<a name="query-controller_resource"></a>
### Query-controller
Query Controller


<a name="getbilllistusingget"></a>
#### 清单记录查询
```
GET /management/v1/query/bill
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**asc**  <br>*可选*||string|
|**Query**|**commandType**  <br>*可选*|请求类型(仅查询清单需要)Charge,Refund,NotBill,All|string|
|**Query**|**desc**  <br>*可选*||string|
|**Query**|**from**  <br>*可选*|起始时间(时间戳)|string|
|**Query**|**locationCode**  <br>*可选*|机构代码|string|
|**Query**|**locationRefid**  <br>*可选*|机构代码Refid|string|
|**Query**|**pageNum**  <br>*可选*||integer (int32)|
|**Query**|**pageSize**  <br>*可选*||integer (int32)|
|**Query**|**timeType**  <br>*可选*|时间维度,StudyTimeStr/AuditDatetime|string|
|**Query**|**to**  <br>*可选*|截止时间(时间戳)|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


##### HTTP请求示例

###### 请求 path
```
/management/v1/query/bill
```


##### HTTP响应示例

###### 响应 200
```json
{
  "code" : "string",
  "data" : "object",
  "msgCode" : "string"
}
```


<a name="queryserviceusingpost"></a>
#### 运营列表查询
```
POST /management/v1/query/queryService
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**asc**  <br>*可选*||string|
|**Query**|**desc**  <br>*可选*||string|
|**Query**|**pageNum**  <br>*可选*||integer (int32)|
|**Query**|**pageSize**  <br>*可选*||integer (int32)|
|**Body**|**queryConditionVo**  <br>*必填*|queryConditionVo|[QueryConditionVo](#queryconditionvo)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


##### HTTP请求示例

###### 请求 path
```
/management/v1/query/queryService
```


###### 请求 body
```json
{
  "accessionNo" : "string",
  "auditDatetime" : {
    "from" : "string",
    "to" : "string"
  },
  "commandType" : "string",
  "deleteReason" : "string",
  "deleteStatus" : "string",
  "filmStatus" : "string",
  "hisId" : "string",
  "insertTime" : {
    "from" : "string",
    "to" : "string"
  },
  "locationCode" : [ "string" ],
  "patientId" : "string",
  "patientName" : "string",
  "paymentStatus" : "string",
  "printTime" : {
    "from" : "string",
    "to" : "string"
  },
  "procedureName" : "string",
  "serviceStatus" : "string",
  "storageExpireTime" : {
    "from" : "string",
    "to" : "string"
  },
  "studyTime" : {
    "from" : "string",
    "to" : "string"
  },
  "viewTime" : {
    "from" : "string",
    "to" : "string"
  }
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "code" : "string",
  "data" : "object",
  "msgCode" : "string"
}
```


<a name="storage-space-controller_resource"></a>
### Storage-space-controller
Storage Space Controller


<a name="getstoragestatisticsusingpost"></a>
#### 获取存储空间大小
```
POST /management/v1/accession/storageSpace
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**storageConditionVo**  <br>*可选*|storageConditionVo|[StorageConditionVo](#storageconditionvo)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


##### HTTP请求示例

###### 请求 path
```
/management/v1/accession/storageSpace
```


###### 请求 body
```json
{
  "accessionVoList" : [ {
    "locationCode" : "string",
    "procedureOffice" : "string",
    "accessionNo" : "string",
    "printTime" : "string",
    "printStatus" : "string",
    "filmCount" : 0
  } ]
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "code" : "string",
  "data" : "object",
  "msgCode" : "string"
}
```




<a name="definitions"></a>
## 定义

<a name="accessionvo"></a>
### AccessionVo
检查信息


|名称|说明|类型|
|---|---|---|
|**accessionNo**  <br>*必填*|检查号  <br>**样例** : `"string"`|string|
|**filmCount**  <br>*可选*|胶片数量,仅打印需要  <br>**样例** : `0`|integer (int32)|
|**locationCode**  <br>*必填*|机构代码  <br>**样例** : `"string"`|string|
|**printStatus**  <br>*可选*|打印状态,仅打印需要  <br>**样例** : `"string"`|string|
|**printTime**  <br>*可选*|打印时间,仅打印需要  <br>**样例** : `"string"`|string|
|**procedureOffice**  <br>*必填*|科室名称  <br>**样例** : `"string"`|string|


<a name="billstatisticsresponse"></a>
### BillStatisticsResponse

|名称|说明|类型|
|---|---|---|
|**accessionCount**  <br>*可选*|**样例** : `0`|integer (int64)|
|**billCount**  <br>*可选*|**样例** : `0`|integer (int64)|
|**chargeCount**  <br>*可选*|**样例** : `0`|integer (int64)|
|**refundCount**  <br>*可选*|**样例** : `0`|integer (int64)|


<a name="configchargerequest"></a>
### ConfigChargeRequest

|名称|说明|类型|
|---|---|---|
|**configChargeItemList**  <br>*可选*|**样例** : `[ "[ad5e6071fdaad122030761f86f35b88a](#ad5e6071fdaad122030761f86f35b88a)" ]`|< [模板配置项](#ad5e6071fdaad122030761f86f35b88a) > array|
|**extraConfig**  <br>*可选*|统计项配置  <br>**样例** : `{<br>  "refundNum" : "0",<br>  "immediatelyPrintNum" : "0",<br>  "serviceTypeNum" : "0",<br>  "storeLoad" : "0",<br>  "printNum" : "0",<br>  "filmTypeNum" : "0",<br>  "receivableNum" : "0",<br>  "overPrintNum" : "0",<br>  "studyTypeNum" : "0",<br>  "patientTypeNum" : "0",<br>  "receiptsNum" : "0"<br>}`|object|
|**templateId**  <br>*可选*|配置模板ID  <br>**样例** : `0`|integer (int64)|


<a name="configtemplaterequest"></a>
### ConfigTemplateRequest

|名称|说明|类型|
|---|---|---|
|**templateName**  <br>*可选*|模板名称  <br>**样例** : `"xxx收费模板"`|string|


<a name="configtemplateupdaterequest"></a>
### ConfigTemplateUpdateRequest

|名称|说明|类型|
|---|---|---|
|**id**  <br>*可选*|模板id(更新操作使用)  <br>**样例** : `0`|integer (int64)|
|**templateName**  <br>*可选*|模板名称  <br>**样例** : `"xxx收费模板"`|string|


<a name="filmserviceparamvo"></a>
### FilmServiceParamVo
胶片服务参数


|名称|说明|类型|
|---|---|---|
|**accessionVoList**  <br>*必填*|检查匹配参数  <br>**样例** : `[ "[accessionvo](#accessionvo)" ]`|< [AccessionVo](#accessionvo) > array|
|**commandType**  <br>*必填*|检查匹配参数  <br>**样例** : `"string"`|string|


<a name="filmstatuscountresponse"></a>
### FilmStatusCountResponse

|名称|说明|类型|
|---|---|---|
|**cloudAndPaperFilm**  <br>*可选*|**样例** : `0`|integer (int64)|
|**cloudFilm**  <br>*可选*|**样例** : `0`|integer (int64)|
|**notUseFilm**  <br>*可选*|**样例** : `0`|integer (int64)|
|**paperFilm**  <br>*可选*|**样例** : `0`|integer (int64)|
|**total**  <br>*可选*|**样例** : `0`|integer (int64)|


<a name="managementstatisticsresponse"></a>
### ManagementStatisticsResponse

|名称|说明|类型|
|---|---|---|
|**billStatisticsResponse**  <br>*可选*|**样例** : `"[billstatisticsresponse](#billstatisticsresponse)"`|[BillStatisticsResponse](#billstatisticsresponse)|
|**filmStatusCountResponse**  <br>*可选*|**样例** : `"[filmstatuscountresponse](#filmstatuscountresponse)"`|[FilmStatusCountResponse](#filmstatuscountresponse)|
|**modalityTypeCountResponse**  <br>*可选*|**样例** : `{<br>  "string" : 0<br>}`|< string, integer (int64) > map|
|**patientTypeCountResponse**  <br>*可选*|**样例** : `"[patienttypecountresponse](#patienttypecountresponse)"`|[PatientTypeCountResponse](#patienttypecountresponse)|
|**printCountResponse**  <br>*可选*|**样例** : `"[printcountresponse](#printcountresponse)"`|[PrintCountResponse](#printcountresponse)|
|**serviceTypeStatisticsResponse**  <br>*可选*|**样例** : `"[servicetypestatisticsresponse](#servicetypestatisticsresponse)"`|[ServiceTypeStatisticsResponse](#servicetypestatisticsresponse)|
|**storageSpaceResponse**  <br>*可选*|**样例** : `"[storagespaceresponse](#storagespaceresponse)"`|[StorageSpaceResponse](#storagespaceresponse)|


<a name="modalitytypecountresponse"></a>
### ModalityTypeCountResponse

|名称|说明|类型|
|---|---|---|
|**modalityTypeMap**  <br>*可选*|**样例** : `{<br>  "string" : 0<br>}`|< string, integer (int64) > map|


<a name="patienttypecountresponse"></a>
### PatientTypeCountResponse

|名称|说明|类型|
|---|---|---|
|**e**  <br>*可选*|**样例** : `0`|integer (int64)|
|**i**  <br>*可选*|**样例** : `0`|integer (int64)|
|**o**  <br>*可选*|**样例** : `0`|integer (int64)|
|**other**  <br>*可选*|**样例** : `0`|integer (int64)|
|**total**  <br>*可选*|**样例** : `0`|integer (int64)|


<a name="printcountresponse"></a>
### PrintCountResponse

|名称|说明|类型|
|---|---|---|
|**currentPeriod**  <br>*可选*|**样例** : `0`|integer (int64)|
|**otherPeriod**  <br>*可选*|**样例** : `0`|integer (int64)|
|**total**  <br>*可选*|**样例** : `0`|integer (int64)|


<a name="queryconditionvo"></a>
### QueryConditionVo
查询条件


|名称|说明|类型|
|---|---|---|
|**accessionNo**  <br>*可选*|检查号  <br>**样例** : `"string"`|string|
|**auditDatetime**  <br>*可选*|审核时间  <br>**样例** : `"[rangevo](#rangevo)"`|[RangeVo](#rangevo)|
|**commandType**  <br>*可选*|**样例** : `"string"`|string|
|**deleteReason**  <br>*可选*|删除原因  <br>**样例** : `"string"`|string|
|**deleteStatus**  <br>*可选*|删除状态  <br>**样例** : `"string"`|string|
|**filmStatus**  <br>*可选*|胶片状态  <br>**样例** : `"string"`|string|
|**hisId**  <br>*可选*|申请单号  <br>**样例** : `"string"`|string|
|**insertTime**  <br>*可选*|上传时间  <br>**样例** : `"[rangevo](#rangevo)"`|[RangeVo](#rangevo)|
|**locationCode**  <br>*可选*|医疗机构代码  <br>**样例** : `[ "string" ]`|< string > array|
|**patientId**  <br>*可选*|患者ID  <br>**样例** : `"string"`|string|
|**patientName**  <br>*可选*|患者姓名  <br>**样例** : `"string"`|string|
|**paymentStatus**  <br>*可选*|缴费状态  <br>**样例** : `"string"`|string|
|**printTime**  <br>*可选*|纸质胶片打印时间  <br>**样例** : `"[rangevo](#rangevo)"`|[RangeVo](#rangevo)|
|**procedureName**  <br>*可选*|检查项目  <br>**样例** : `"string"`|string|
|**serviceStatus**  <br>*可选*|服务状态  <br>**样例** : `"string"`|string|
|**storageExpireTime**  <br>*可选*|存储到期时间  <br>**样例** : `"[rangevo](#rangevo)"`|[RangeVo](#rangevo)|
|**studyTime**  <br>*可选*|检查时间  <br>**样例** : `"[rangevo](#rangevo)"`|[RangeVo](#rangevo)|
|**viewTime**  <br>*可选*|首次访问时间  <br>**样例** : `"[rangevo](#rangevo)"`|[RangeVo](#rangevo)|


<a name="rangevo"></a>
### RangeVo
范围信息


|名称|说明|类型|
|---|---|---|
|**from**  <br>*可选*|起始值  <br>**样例** : `"string"`|string|
|**to**  <br>*可选*|截止值  <br>**样例** : `"string"`|string|


<a name="result"></a>
### Result

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `"string"`|string|
|**data**  <br>*可选*|**样例** : `"object"`|object|
|**msgCode**  <br>*可选*|**样例** : `"string"`|string|


<a name="servicetypestatisticsresponse"></a>
### ServiceTypeStatisticsResponse

|名称|说明|类型|
|---|---|---|
|**close**  <br>*可选*|**样例** : `0`|integer (int64)|
|**open**  <br>*可选*|**样例** : `0`|integer (int64)|


<a name="storageconditionvo"></a>
### StorageConditionVo
胶片服务参数


|名称|说明|类型|
|---|---|---|
|**accessionVoList**  <br>*必填*|检查匹配参数  <br>**样例** : `[ "[accessionvo](#accessionvo)" ]`|< [AccessionVo](#accessionvo) > array|


<a name="storagespaceresponse"></a>
### StorageSpaceResponse

|名称|说明|类型|
|---|---|---|
|**softDelete**  <br>*可选*|**样例** : `"string"`|string|
|**total**  <br>*可选*|**样例** : `"string"`|string|


<a name="deleteserviceparamvo"></a>
### deleteServiceParamVo
删除服务参数


|名称|说明|类型|
|---|---|---|
|**accessionVoList**  <br>*必填*|检查匹配参数  <br>**样例** : `[ "[accessionvo](#accessionvo)" ]`|< [AccessionVo](#accessionvo) > array|
|**userId**  <br>*可选*|用户Id  <br>**样例** : `"string"`|string|
|**userName**  <br>*可选*|用户名称  <br>**样例** : `"string"`|string|


<a name="ad5e6071fdaad122030761f86f35b88a"></a>
### 模板配置项

|名称|说明|类型|
|---|---|---|
|**charge**  <br>*可选*|收费标准金额  <br>**样例** : `10.0`|number|
|**chargeType**  <br>*可选*|收费类型 1-收费 2-不收费  <br>**样例** : `1`|integer (int32)|
|**chargeUnit**  <br>*可选*|收费金额计量单位 1-元/张 2-元/例  <br>**样例** : `1`|integer (int32)|
|**examType**  <br>*可选*|检查类型 ALL/DR/CT/MR  <br>**样例** : `"ALL"`|string|
|**filmType**  <br>*可选*|胶片类型 0-初始状态 1-云胶片 2-物理胶片 3-云胶片&物理胶片  <br>**样例** : `0`|integer (int32)|
|**patientType**  <br>*可选*|患者类型 E- 体检 I-住院 O-门诊 Other-其他  <br>**样例** : `"Other"`|string|
|**serviceType**  <br>*可选*|服务类型  1-开启 2-关闭  <br>**样例** : `1`|integer (int32)|
|**storeLife**  <br>*可选*|存储周期 单位年  <br>**样例** : `10`|integer (int32)|
|**storeLifeUnit**  <br>*可选*|储周期单位 0-天 1-月 2- 年  <br>**样例** : `1`|integer (int32)|


<a name="a4656e45304aae58d0042aedd8d1f337"></a>
### 软删除条件model

|名称|说明|类型|
|---|---|---|
|**softDeleteLife**  <br>*可选*|软删除存储周期  <br>**样例** : `5`|integer (int32)|
|**softDeleteLifeUnit**  <br>*可选*|软删除存储周期单位 0-天 1-月 2- 年  <br>**样例** : `2`|integer (int32)|
|**softType**  <br>*可选*|删除条件类型  1- 未开通云胶片检查 2-以上传时间计算 3- 以检查时间计算 4-以审核时间计算  <br>**样例** : `1`|integer (int32)|


<a name="e80838225c51052d2c0cf2931f1871f0"></a>
### 配置运营策略model

|名称|说明|类型|
|---|---|---|
|**chargeTemplateId**  <br>*可选*|绑定收费结算模板id  <br>**样例** : `0`|integer (int64)|
|**deleteHardLife**  <br>*可选*|软删除后到系统自动硬删除的周期  <br>**样例** : `10`|integer (int32)|
|**deleteHardLifeUnit**  <br>*可选*|软删除后到系统自动硬删除的周期单位 0-天 1-月 2- 年  <br>**样例** : `2`|integer (int32)|
|**deleteSoftShow**  <br>*可选*|软删除是否在页面展示 false-不展示 true-展示  <br>**样例** : `false`|boolean|
|**id**  <br>*可选*|主键(为空或者0 则执行新增,否则执行修改)  <br>**样例** : `0`|integer (int64)|
|**locationRefid**  <br>*可选*|locaiton id  <br>**样例** : `"string"`|string|
|**softConditionList**  <br>*可选*|软删除条件  <br>**样例** : `[ ]`|< [软删除条件model](#a4656e45304aae58d0042aedd8d1f337) > array|




<a name="securityscheme"></a>
## 安全

<a name="authorization"></a>
### Authorization
*类型* : apiKey  
*名称* : Authorization  
*在* : HEADER



