# big-data-assignment

## directory
```
├── kmercount
│   ├── ecoli.fa.gz
│   ├── kc.jar
│   ├── khmercount-sorted-output
│   ├── KmerCount.java
│   └── kmercount-output
├── LICENSE
├── README.md
└── wordcount
    ├── shakes.nopunc.gz
    ├── wc.jar
    ├── WordCount.java
    ├── wordcount-output
    └── wordcount-sorted-output
```

## how to sort output <key, value> file

For example, I want to sort [kmercount-output](kmercount/kmercount-output). Use this sort command in linux
```
sort -nrk2 kmercount/kmercount-output -o kmercount/kmercount-sorted-output
```
