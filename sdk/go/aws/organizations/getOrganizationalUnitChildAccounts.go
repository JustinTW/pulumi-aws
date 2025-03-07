// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package organizations

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Get all direct child accounts under a parent organizational unit. This only provides immediate children, not all children.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/organizations"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			org, err := organizations.LookupOrganization(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			_, err = organizations.GetOrganizationalUnitChildAccounts(ctx, &organizations.GetOrganizationalUnitChildAccountsArgs{
//				ParentId: org.Roots[0].Id,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetOrganizationalUnitChildAccounts(ctx *pulumi.Context, args *GetOrganizationalUnitChildAccountsArgs, opts ...pulumi.InvokeOption) (*GetOrganizationalUnitChildAccountsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetOrganizationalUnitChildAccountsResult
	err := ctx.Invoke("aws:organizations/getOrganizationalUnitChildAccounts:getOrganizationalUnitChildAccounts", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getOrganizationalUnitChildAccounts.
type GetOrganizationalUnitChildAccountsArgs struct {
	// The parent ID of the accounts.
	ParentId string `pulumi:"parentId"`
}

// A collection of values returned by getOrganizationalUnitChildAccounts.
type GetOrganizationalUnitChildAccountsResult struct {
	// List of child accounts, which have the following attributes:
	Accounts []GetOrganizationalUnitChildAccountsAccount `pulumi:"accounts"`
	// The provider-assigned unique ID for this managed resource.
	Id       string `pulumi:"id"`
	ParentId string `pulumi:"parentId"`
}

func GetOrganizationalUnitChildAccountsOutput(ctx *pulumi.Context, args GetOrganizationalUnitChildAccountsOutputArgs, opts ...pulumi.InvokeOption) GetOrganizationalUnitChildAccountsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetOrganizationalUnitChildAccountsResult, error) {
			args := v.(GetOrganizationalUnitChildAccountsArgs)
			r, err := GetOrganizationalUnitChildAccounts(ctx, &args, opts...)
			var s GetOrganizationalUnitChildAccountsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetOrganizationalUnitChildAccountsResultOutput)
}

// A collection of arguments for invoking getOrganizationalUnitChildAccounts.
type GetOrganizationalUnitChildAccountsOutputArgs struct {
	// The parent ID of the accounts.
	ParentId pulumi.StringInput `pulumi:"parentId"`
}

func (GetOrganizationalUnitChildAccountsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetOrganizationalUnitChildAccountsArgs)(nil)).Elem()
}

// A collection of values returned by getOrganizationalUnitChildAccounts.
type GetOrganizationalUnitChildAccountsResultOutput struct{ *pulumi.OutputState }

func (GetOrganizationalUnitChildAccountsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetOrganizationalUnitChildAccountsResult)(nil)).Elem()
}

func (o GetOrganizationalUnitChildAccountsResultOutput) ToGetOrganizationalUnitChildAccountsResultOutput() GetOrganizationalUnitChildAccountsResultOutput {
	return o
}

func (o GetOrganizationalUnitChildAccountsResultOutput) ToGetOrganizationalUnitChildAccountsResultOutputWithContext(ctx context.Context) GetOrganizationalUnitChildAccountsResultOutput {
	return o
}

func (o GetOrganizationalUnitChildAccountsResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetOrganizationalUnitChildAccountsResult] {
	return pulumix.Output[GetOrganizationalUnitChildAccountsResult]{
		OutputState: o.OutputState,
	}
}

// List of child accounts, which have the following attributes:
func (o GetOrganizationalUnitChildAccountsResultOutput) Accounts() GetOrganizationalUnitChildAccountsAccountArrayOutput {
	return o.ApplyT(func(v GetOrganizationalUnitChildAccountsResult) []GetOrganizationalUnitChildAccountsAccount {
		return v.Accounts
	}).(GetOrganizationalUnitChildAccountsAccountArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetOrganizationalUnitChildAccountsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetOrganizationalUnitChildAccountsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetOrganizationalUnitChildAccountsResultOutput) ParentId() pulumi.StringOutput {
	return o.ApplyT(func(v GetOrganizationalUnitChildAccountsResult) string { return v.ParentId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetOrganizationalUnitChildAccountsResultOutput{})
}
