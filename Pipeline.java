Pipeline{
     agent any
          Stages{
               Stage('check validate'){
                  Steps{
                      echo ' I am validating the code'
                     }
                     }
              Stage('compilation'){
                 Steps{
                       echo' I am compiling the code'
                    }
                    }
             Stage('Install'){
                Steps{
                   echo'I am installing the code'
                    }
                    }
            Stage('Deploy'){
               Steps{
                  echo'I am deploying the code'
                    }
                    }
             }
             }