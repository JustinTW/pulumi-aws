// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***


export const Runtime = {
    /**
     * @deprecated This runtime is now deprecated
     */
    DotnetCore2d1: "dotnetcore2.1",
    DotnetCore3d1: "dotnetcore3.1",
    Dotnet5d0: "dotnet5.0",
    Dotnet6: "dotnet6",
    Go1dx: "go1.x",
    Java8: "java8",
    Java8AL2: "java8.al2",
    Java11: "java11",
    Java17: "java17",
    /**
     * @deprecated This runtime is now deprecated
     */
    Ruby2d5: "ruby2.5",
    Ruby2d7: "ruby2.7",
    Ruby3d2: "ruby3.2",
    /**
     * @deprecated This runtime is now deprecated
     */
    NodeJS10dX: "nodejs10.x",
    NodeJS12dX: "nodejs12.x",
    NodeJS14dX: "nodejs14.x",
    NodeJS16dX: "nodejs16.x",
    NodeJS18dX: "nodejs18.x",
    /**
     * @deprecated This runtime is now deprecated
     */
    Python2d7: "python2.7",
    /**
     * @deprecated This runtime is now deprecated
     */
    Python3d6: "python3.6",
    Python3d7: "python3.7",
    Python3d8: "python3.8",
    Python3d9: "python3.9",
    Python3d10: "python3.10",
    Python3d11: "python3.11",
    Custom: "provided",
    CustomAL2: "provided.al2",
} as const;

/**
 * See https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html
 */
export type Runtime = (typeof Runtime)[keyof typeof Runtime];
