package easy.e47_working_experience

import util.CodeEvalRunner

/**
 * Created by develop on 2014/09/02.
 */
class MainGroovy {
    static main(argv) {
        //CodeEvalRunner.run(["input/easy/e47_working_experience.txt"] as String[], Main)
        CodeEvalRunner.run(["Feb 2004-Dec 2009; Sep 2004-Jul 2008",
                            "Aug 2013-Mar 2014; Apr 2013-Aug 2013; Jun 2014-Aug 2015; Apr 2003-Nov 2004; Apr 2014-Jan 2015",
                            "Mar 2003-Jul 2003; Nov 2003-Jan 2004; Apr 1999-Nov 1999",
                            "Apr 1992-Dec 1993; Feb 1996-Sep 1997; Jan 2002-Jun 2002; Sep 2003-Apr 2004; Feb 2010-Nov 2011",
                            "Feb 2004-May 2004; Jun 2004-Jul 2004"
        ] as String[], Main, true)
    }
}