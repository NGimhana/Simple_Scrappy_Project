## Simple Scrapy Project

This is a simple web crawling application implemented using "scrapy" python lib.



### Collecting Data


Execute below terminal command.

```
scrapy crawl quotes -o quotes.json
```


### Configuring Solr

Using Solr Default Filters

Added Configuration Files @ solr-7.7.2\server\solr\IR-project3\conf

1. Sinhala English Mapping for Category
2. Lower Case Filters for english terms
3. Sinhala Synonyms
4. Sinhala Stop words
5. Month Mapping in Date (English --> sinhala)


Using Custom Filters

Added in Custom_Filters_Solr Folder 

1. Number to Text Custom Filter
2. Text to Number
3. Sinhala stemmer
4. Mahaprana Letters Filter
5. Numeric String Mapping (eg. එකක්  --> 1ක් )