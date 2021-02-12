# Antrl4 
Antlr is a parser generator tool. You can read about it on it's [offical website](https://www.antlr.org/). 

## Genius Sync Parser
This project is created to parse files provided by various psses. Each parser's folder consists of four main parts,  
the grammar, the generated files(lexer, tokenizer, parser, visitors), and the manual implementation of the visitors,  
and the data classes.

To understand how to make changes to the grammar read the [mega tutorial](https://tomassetti.me/antlr-mega-tutorial/#lexers-and-parser). One thing to note is that  
when the grammar is ambiguous, antlr will choose the first lexer rule from top to bottom. This can happen,
for example,  
when you have these lexer rules `WORD: [a-Z]+;` `ID: ([a-Z] | [0-9])+;`. If the ID happens to consist of only
letters, then it  
will be associated with the `WORD` rule, and the token will be generated based on this match. You can resolve this ambiguite  
with the approach mentioned in the tutorial.

### Generating files from the grammar   
If you change the grammar, you will have to regenerate all the files in the `generated` folder. To do this you will have to download   
antlr4 to your local machine. You will find guide in both the official website and the mega tutorial.
Commands that you will have to execute:  
$ `cd /usr/local/lib`  
$ `sudo curl -O https://www.antlr.org/download/antlr-4.8-complete.jar`  
$ `export CLASSPATH=".:/usr/local/lib/antlr-4.8-complete.jar:$CLASSPATH"`  
$ `alias antlr4='java -jar /usr/local/lib/antlr-4.8-complete.jar'`  
$ `alias grun='java org.antlr.v4.gui.TestRig'`  

I advise you to put the last three commands into your `.zshrc` or `.bashrc` file and don't forget to `source` it, because if you close the terminal, you will have to rerun these commands.  

Generate the files from the `grammar` folder with this command:  
$ `antlr4 <grammar-file-name>.g4 -o ../generated -no-listener -visitor`  

Well done you just generated a new parser!

### Deploying the project

You can deploy by simply tagging master or your branch in Azure Devops. This will trigger  
an automatic build in the pipeline, and it will deploy the project to the kambr maven repo(Artifacts tab in Azure).  
You can deploy manually as well. Run `git pull --tag` to pull down the latest tag. Then run `gradle publish`.  
If the tag is already present in the repo, the publish step will fail. 